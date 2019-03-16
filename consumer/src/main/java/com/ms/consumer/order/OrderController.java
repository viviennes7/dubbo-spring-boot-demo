package com.ms.consumer.order;

import com.ms.provider.member.Member;
import com.ms.provider.member.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Reference(url = "dubbo://127.0.0.1:12345")
    private MemberService memberService;

    @PostMapping
    public String order(@RequestBody OrderRequest request) {
        final Member member = this.memberService.getMember(request.getMemberId());
        logger.info("result ::: {}", member);

        //...
        return "success";
    }
}

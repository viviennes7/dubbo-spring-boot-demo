package com.ms.provider.member;

import org.springframework.stereotype.Service;

@Service
@org.apache.dubbo.config.annotation.Service
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member getMember(Long id) {
        return this.memberRepository.findById(id)
                .orElseThrow(NotFoundMember::new);
    }

    public static class NotFoundMember extends RuntimeException {
    }
}

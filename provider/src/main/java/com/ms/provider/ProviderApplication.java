package com.ms.provider;

import com.ms.provider.member.Member;
import com.ms.provider.member.MemberRepository;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@DubboComponentScan
@SpringBootApplication
public class ProviderApplication implements CommandLineRunner {

    private final MemberRepository memberRepository;

    public ProviderApplication(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.memberRepository.save(new Member("minsoo", 27,"강남구" ,LocalDateTime.now()));
    }
}

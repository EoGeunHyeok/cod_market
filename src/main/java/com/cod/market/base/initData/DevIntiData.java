package com.cod.market.base.initData;

import com.cod.market.member.service.MemberService;
import com.cod.market.product.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevIntiData implements BeforeIntiData {
    @Bean
    CommandLineRunner initData(MemberService memberService, ProductService productService) {
        return args -> {
            beforeInit();

            String password = "{noop}1234"; // noop을 해주면 난수처럼 들어감
            memberService.signup("user1",password,"user1@test.com","user1");
            memberService.signup("user2",password,"user2@test.com","user2");
            memberService.signup("cake",password,"cake@test.com","예지");
            memberService.signup("admin",password,"admin@test.com","admin");
        };
    }
}

package com.cod.market.service;

import com.cod.market.member.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceTests {
    @Autowired
    private MemberService memberServcie;

    @Test
    @DisplayName("회원가입")
    void t1() {
    String username = "user1";
    String password = "1234";
    String email = "user1@test.com";
    String nickname = "user1";

    memberServcie.signup(username, password, email, nickname);

    }
}

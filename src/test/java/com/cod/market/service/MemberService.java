package com.cod.market.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberService {
    @Autowired
    private MemberService memberservice;

    @Test
    @DisplayName("회원가입")
    void t1() {
    String username = "user1";
    String password = "1234";
    String email = "user1@test.com";
    String nickname = "user1";

    memberservice.signup(username, password, email, nickname);
    }
}

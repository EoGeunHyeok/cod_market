package com.cod.market.service;

import com.cod.market.product.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTests {
    @Autowired
    private ProductService productService;

    @Test
    @DisplayName("강의 제품 생성")
    void test1 () {
        for ( int i = 1; i <= 200; i++) {
            String name = String.format("짱곰이의 플러팅 기술 :[%03d]장", i);
            int price = 100;
            String description = String.format("짱곰이만 따라하세요! :[%03d]장 , 누구나 할 수 있따!", i);
            productService.create(name, description, price);
        }
    }
}

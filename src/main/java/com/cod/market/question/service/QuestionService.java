package com.cod.market.question.service;

import com.cod.market.member.entity.Member;
import com.cod.market.product.entity.Product;
import com.cod.market.question.entity.Question;
import com.cod.market.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;


    public void create(Product product, Member member, String content) {

        Question question = Question.builder()
                .product(product)
                .member(member)
                .content(content)
                .createDate(LocalDateTime.now())
                .build();


        questionRepository.save(question);
    }


//    public void create(Product product, Member member, String content) {
//        Question q = new Question();
//        q.setProduct(product);
//        q.setMember(member);
//        q.setContent(content);
//        q.setCreateDate(LocalDateTime.now());
//        questionRepository.save(q);
//    }
}

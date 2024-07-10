package com.cod.market.question.entity;

import com.cod.market.base.BaseEntity;
import com.cod.market.member.entity.Member;
import com.cod.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
public class Question extends BaseEntity {

    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;

    private LocalDateTime createDate;
}
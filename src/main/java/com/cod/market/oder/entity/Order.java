package com.cod.market.oder.entity;

import com.cod.market.base.entity.BaseEntity;
import com.cod.market.member.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name="product_order") // 이미 자체에  order라는 테이블이 있어서 리팩토리 하지 안으려면 달아줘야함
public class Order extends BaseEntity {
    @ManyToOne(fetch = LAZY)
    private Member buyer;
    private String name;
    private boolean isPaid;
    private boolean isCanceled;
    private boolean isRefunded;

    @OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE)
    private List<OrderItem> orderItemList;
}

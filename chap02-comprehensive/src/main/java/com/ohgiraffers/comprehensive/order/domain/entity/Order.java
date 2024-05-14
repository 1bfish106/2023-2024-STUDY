package com.ohgiraffers.comprehensive.order.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_order")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderCode;
    private Long productCode;
    private Long memberCode;
    private String orderPhone;
    private String orderEmail;
    private String orderReceiver;
    private String orderAddress;
    private Long orderAmount;
    @CreatedDate
    private LocalDateTime orderDate;









}

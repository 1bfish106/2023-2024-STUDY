package com.ohgiraffers.comprehensive.order.domain.repository;

import com.ohgiraffers.comprehensive.order.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

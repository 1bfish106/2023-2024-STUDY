package com.ohgiraffers.comprehensive.order.service;

import com.ohgiraffers.comprehensive.order.domain.entity.Order;
import com.ohgiraffers.comprehensive.order.domain.repository.OrderRepository;
import com.ohgiraffers.comprehensive.order.dto.request.OrderCreateRequest;
import com.ohgiraffers.comprehensive.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final ProductService productService;
    private final OrderRepository orderRepository;
    public void save(OrderCreateRequest orderRequest, Long memberCode) {

        updateStock(orderRequest.getProductCode(), orderRequest.getOrderAmount());

        final Order newOrder = Order.of();

        orderRepository.save(newOrder);
    }

    private void updateStock(Long productCode, Long orderAmount) {
        productService.updateStock(productCode, orderAmount);
    }
}

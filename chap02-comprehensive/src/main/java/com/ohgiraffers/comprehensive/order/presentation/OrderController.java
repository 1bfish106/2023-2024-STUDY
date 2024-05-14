package com.ohgiraffers.comprehensive.order.presentation;

import com.ohgiraffers.comprehensive.auth.type.CustomUser;
import com.ohgiraffers.comprehensive.order.dto.request.OrderCreateRequest;
import com.ohgiraffers.comprehensive.order.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    /* 주문 등록 */
    @PostMapping("/orders")
    public ResponseEntity<Void> save(
            @RequestBody @Valid final OrderCreateRequest orderRequest,
            @AuthenticationPrincipal final CustomUser customUser
            ) {

        orderService.save(orderRequest, customUser.getMemberCode());

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }






}

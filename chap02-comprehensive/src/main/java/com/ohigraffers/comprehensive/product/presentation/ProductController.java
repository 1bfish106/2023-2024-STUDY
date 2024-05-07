package com.ohigraffers.comprehensive.product.presentation;

import com.ohigraffers.comprehensive.product.dto.response.CustomerProductsResponse;
import com.ohigraffers.comprehensive.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductService productService;

    /* 상품 목록 조회 (고객) */
    @GetMapping("/products")
    public ResponseEntity<> getCustomerProducts(
            @RequestParam(defaultValue = "1") final Integer page,
            @RequestParam(required = false) final Long categoryCode,
            @RequestParam(required = false) final String productName
    ) {

        final Page<CustomerProductsResponse> products = productService.getCustomerProducts(page, categoryCode, productName);

        return ResponseEntity.ok();
    }
















}

package com.ohigraffers.comprehensive.product.service;

import com.ohigraffers.comprehensive.product.domain.entity.Product;
import com.ohigraffers.comprehensive.product.domain.repository.ProductRepository;
import com.ohigraffers.comprehensive.product.domain.type.ProductStatusType;
import com.ohigraffers.comprehensive.product.dto.response.AdminProductsResponse;
import com.ohigraffers.comprehensive.product.dto.response.CustomerProductResponse;
import com.ohigraffers.comprehensive.product.dto.response.CustomerProductsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    private Pageable getPageable(final Integer page) {
        return PageRequest.of(page - 1, 10, Sort.by("productCode").descending());
    }

    /* 상품 목록 조회 (고객) */
    @Transactional(readOnly = true)
    public Page<CustomerProductsResponse> getCustomerProducts(final Integer page, final Long categoryCode, final String productName) {

        Page<Product> products = null;
        if(categoryCode != null && categoryCode > 0) {
            products = productRepository.findByCategoryCategoryCodeAndStatus(getPageable(page), categoryCode, ProductStatusType.USABLE);
        } else if(productName != null && !productName.isEmpty()) {
            products = productRepository.findByProductNameContainsAndStatus(getPageable(page), productName, ProductStatusType.USABLE);
        } else {
            products = productRepository.findByStatus(getPageable(page), ProductStatusType.USABLE);
        }

        return products.map(CustomerProductsResponse::from);
    }

    /* 상품 목록 조회 (관리자) */
    @Transactional(readOnly = true)
    public Page<AdminProductsResponse> getAdminProducts(final Integer page) {

        Page<Product> products = productRepository.findByStatusNot(getPageable(page), ProductStatusType.DELETED);

        return products.map(AdminProductsResponse::from);

    }

    /* 상품 상세 조회 (고객) */
    @Transactional(readOnly = true)
    public CustomerProductResponse getCustomerProduct(final Long productCode) {

        Product product = productRepository.findByProductCodeAndStatus(productCode, ProductStatusType.USABLE)
                .orElseThrow();

        return CustomerProductResponse.from(product);
    }



}

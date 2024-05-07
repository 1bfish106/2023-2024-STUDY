package com.ohigraffers.comprehensive.product.presentation;

import com.ohigraffers.comprehensive.common.paging.Pagenation;
import com.ohigraffers.comprehensive.common.paging.PagingButtonInfo;
import com.ohigraffers.comprehensive.common.paging.PagingResponse;
import com.ohigraffers.comprehensive.product.dto.request.ProductCreateRequest;
import com.ohigraffers.comprehensive.product.dto.response.AdminProductResponse;
import com.ohigraffers.comprehensive.product.dto.response.AdminProductsResponse;
import com.ohigraffers.comprehensive.product.dto.response.CustomerProductResponse;
import com.ohigraffers.comprehensive.product.dto.response.CustomerProductsResponse;
import com.ohigraffers.comprehensive.product.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductService productService;

    /* 상품 목록 조회 (고객) */
    @GetMapping("/products")
    public ResponseEntity<PagingResponse> getCustomerProducts(
            @RequestParam(defaultValue = "1") final Integer page,
            @RequestParam(required = false) final Long categoryCode,
            @RequestParam(required = false) final String productName
    ) {

        final Page<CustomerProductsResponse> products = productService.getCustomerProducts(page, categoryCode, productName);
        final PagingButtonInfo pagingButtonInfo = Pagenation.getPagingButtonInfo(products);
        final PagingResponse pagingResponse = PagingResponse.of(products.getContent(), pagingButtonInfo);

        return ResponseEntity.ok(pagingResponse);
    }

    /* 상품 목록 조회 (관리자) */
    @GetMapping("/products-management")
    public ResponseEntity<PagingResponse> getAdminProducts(
            @RequestParam(defaultValue = "1") final Integer page
    ) {

        final Page<AdminProductsResponse> products = productService.getAdminProducts(page);
        final PagingButtonInfo pagingButtonInfo = Pagenation.getPagingButtonInfo(products);
        final PagingResponse pagingResponse = PagingResponse.of(products.getContent(), pagingButtonInfo);

        return ResponseEntity.ok(pagingResponse);
    }

    /* 상품 상세 조회 (고객) */
    @GetMapping("/products/{productCode}")
    public ResponseEntity<CustomerProductResponse> getCustomerProduct(@PathVariable final Long productCode) {

        final CustomerProductResponse customerProductResponse = productService.getCustomerProduct(productCode);

        return ResponseEntity.ok(customerProductResponse);
    }

    /* 상품 상세 조회 (관리자)
     * GET /products-management/{productCode} */
    @GetMapping("/products-management/{productCode}")
    public ResponseEntity<AdminProductResponse> getAdminProduct(@PathVariable final Long productCode) {

        final AdminProductResponse adminProductResponse = productService.getAdminProduct(productCode);

        return ResponseEntity.ok(adminProductResponse);
    }

    /* 상품 등록(관리자) */
    @PostMapping("/products")
    public ResponseEntity<Void> save(
            /* MultipartFile과 JSON을 동시에 전송하는 방법 */
            @RequestPart @Valid final ProductCreateRequest productRequest,
            @RequestPart final MultipartFile productImg
            ) {

        final Long productCode = productService.save(productRequest, productImg);

        return ResponseEntity.created(URI.create("/api/v1/products-management/" + productCode)).build();
    }


















}

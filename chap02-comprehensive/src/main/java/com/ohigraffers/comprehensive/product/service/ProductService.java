package com.ohigraffers.comprehensive.product.service;

import com.ohigraffers.comprehensive.common.exception.NotFoundException;
import com.ohigraffers.comprehensive.common.exception.type.ExceptionCode;
import com.ohigraffers.comprehensive.product.domain.entity.Category;
import com.ohigraffers.comprehensive.product.domain.entity.Product;
import com.ohigraffers.comprehensive.product.domain.repository.CategoryRepository;
import com.ohigraffers.comprehensive.product.domain.repository.ProductRepository;
import com.ohigraffers.comprehensive.product.domain.type.ProductStatusType;
import com.ohigraffers.comprehensive.product.dto.request.ProductCreateRequest;
import com.ohigraffers.comprehensive.product.dto.response.AdminProductResponse;
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
import org.springframework.web.multipart.MultipartFile;


@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

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
                .orElseThrow(() -> new NotFoundException(ExceptionCode.NOT_FOUND_PRODUCT_CODE));

        return CustomerProductResponse.from(product);
    }

    /* 상품 상세 조회 (관리자)
    * AdminProductResponse로 응답 */
    @Transactional(readOnly = true)
    public AdminProductResponse getAdminProduct(final Long productCode) {

        Product product = productRepository.findByProductCodeAndStatusNot(productCode, ProductStatusType.DELETED)
                .orElseThrow(() -> new NotFoundException(ExceptionCode.NOT_FOUND_PRODUCT_CODE));

        return AdminProductResponse.from(product);
    }


    /* 상품 등록(관리자) */
    public Long save(final ProductCreateRequest productRequest, final MultipartFile productImg) {

        /* 전달 받은 categoryCode를 통해 Category Entity 조회 */

        /* findById : tbl_category에 대한 select 구문이 반드시 실행 된다. */
        //Category category = categoryRepository.findById(productRequest.getCategoryCode());
        /* getReferenceById : category가 사용 되지 않는다면 tbl_category에 대한 select 구문이 실행 되지 않는다. */
        Category category = categoryRepository.getReferenceById(productRequest.getCategoryCode());

        final Product newProduct = Product.of(
                productRequest.getProductName(),
                productRequest.getProductPrice(),
                productRequest.getProductDescription(),
                category, // 카테고리 엔티티
                "",   // 저장 된 파일의 url
                productRequest.getProductStock()
        );

        final Product product = productRepository.save(newProduct);

        return product.getProductCode();
    }







}

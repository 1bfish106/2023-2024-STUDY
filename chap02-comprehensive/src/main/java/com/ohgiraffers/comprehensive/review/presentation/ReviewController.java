package com.ohgiraffers.comprehensive.review.presentation;

import com.ohgiraffers.comprehensive.auth.type.CustomUser;
import com.ohgiraffers.comprehensive.common.paging.PagingResponse;
import com.ohgiraffers.comprehensive.review.dto.request.ReviewCreateRequest;
import com.ohgiraffers.comprehensive.review.service.ReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    /* 리뷰 작성 */
    @PostMapping("/products/{productCode}/reviews")
    public ResponseEntity<Void> save(
            @RequestBody @Valid final ReviewCreateRequest reviewRequest,
            @AuthenticationPrincipal final CustomUser customUser
            ) {

        reviewService.save(reviewRequest, customUser.getMemberCode());

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /* 상품별 리뷰 목록 조회 */
    @GetMapping("/products/{productCode}/reviews")
    public ResponseEntity<PagingResponse> getReviews() {
        
        return ResponseEntity.ok(null);
    }






}

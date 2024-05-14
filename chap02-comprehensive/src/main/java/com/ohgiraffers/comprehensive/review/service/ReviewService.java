package com.ohgiraffers.comprehensive.review.service;

import com.ohgiraffers.comprehensive.common.exception.ConflictException;
import com.ohgiraffers.comprehensive.order.service.OrderService;
import com.ohgiraffers.comprehensive.review.domain.entity.Review;
import com.ohgiraffers.comprehensive.review.domain.repository.ReviewRepository;
import com.ohgiraffers.comprehensive.review.dto.request.ReviewCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.ohgiraffers.comprehensive.common.domain.type.StatusType.USABLE;
import static com.ohgiraffers.comprehensive.common.exception.type.ExceptionCode.ALREADY_EXIST_REVIEW;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewService {

    private final OrderService orderService;
    private final ReviewRepository reviewRepository;

    public void save(ReviewCreateRequest reviewRequest, Long memberCode) {

        verifyOrdered(reviewRequest.getOrderCode(), memberCode);
        verifyReviewNotCreated(reviewRequest.getOrderCode());

        Review newReview = Review.of(
                reviewRequest.getOrderCode(),
                reviewRequest.getReviewTitle(),
                reviewRequest.getReviewContent()
        );

        reviewRepository.save(newReview);
    }

    private void verifyReviewNotCreated(Long orderCode) {
        if(reviewRepository.existsByOrderCodeAndStatus(orderCode, USABLE)) {
            throw new ConflictException(ALREADY_EXIST_REVIEW);
        }
    }

    private void verifyOrdered(Long orderCode, Long memberCode) {
        orderService.verifyOrdered(orderCode, memberCode);
    }
}

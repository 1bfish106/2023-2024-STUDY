package com.ohgiraffers.comprehensive.review.domain.repository;

import com.ohgiraffers.comprehensive.common.domain.type.StatusType;
import com.ohgiraffers.comprehensive.review.domain.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository <Review, Long>{
    boolean existsByOrderCodeAndStatus(Long orderCode, StatusType statusType);
}

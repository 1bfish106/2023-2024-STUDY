package com.ohgiraffers.comprehensive.review.domain.entity;

import com.ohgiraffers.comprehensive.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_review")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewCode;
    private Long orderCode;
    private String reviewTitle;
    private String reviewContent;

}

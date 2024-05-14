package com.ohgiraffers.comprehensive.order.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class OrdersResponse {

    private Long orderCode;
    private Long productCode;
    private String productName;
    private Long productPrice;
    private Long orderAmount;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderDate;
    private Long reviewCode;
    private String reviewTitle;
    private String reviewContent;










}

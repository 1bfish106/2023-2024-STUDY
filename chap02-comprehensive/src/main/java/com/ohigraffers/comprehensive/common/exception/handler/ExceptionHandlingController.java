package com.ohigraffers.comprehensive.common.exception.handler;

import com.ohigraffers.comprehensive.common.exception.NotFoundException;
import com.ohigraffers.comprehensive.common.exception.dto.response.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlingController {

    /* Not Found Exception */
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionResponse> notFoundException(NotFoundException e) {

        final ExceptionResponse exceptionResponse = ExceptionResponse.of(e.getCode(), e.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
    }
}

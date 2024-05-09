package com.ohgiraffers.comprehensive.auth.util;

import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtils {

    private static Long accessTokenExpiration;
    private static Long refreshTokenExpiration;

    @Value("${jwt.access.expiration}")
    public void setAccessTokenExpiration(Long accessTokenExpiration) {
        TokenUtils.accessTokenExpiration = accessTokenExpiration;
    }

    @Value("${jwt.refresh.expiration}")
    public void setRefreshTokenExpiration(Long refreshTokenExpiration) {
        TokenUtils.refreshTokenExpiration = refreshTokenExpiration;
    }


    public static String createAccessToken(Map<String, Object> memberInfo) {

        return Jwts.builder()
                .setHeader(createHeader())
                .setSubject("AccessToken")
                .setClaims(memberInfo)
                .setExpiration(new Date(System.currentTimeMillis() + accessTokenExpiration))
//                .signWith()
                .compact();
    }

    private static Map<String, Object> createHeader() {
        Map<String, Object> header = new HashMap<>();
        header.put("type", "jwt");
        header.put("date", System.currentTimeMillis());
        return header;
    }

    public static String createRefreshToken() {

        return null;
    }
}

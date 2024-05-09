package com.ohgiraffers.comprehensive.auth.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtils {

    private static String jwtSecretKey;
    private static Long accessTokenExpiration;
    private static Long refreshTokenExpiration;

    @Value("${jwt.secret}")
    public void setJwtSecretKey(String jwtSecretKey) {
        TokenUtils.jwtSecretKey = jwtSecretKey;
    }

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
                .signWith(createSignature(), SignatureAlgorithm.HS512)
                .compact();
    }

    private static Key createSignature() {
        byte[] keyBytes = Decoders.BASE64.decode(jwtSecretKey);
        return Keys.hmacShaKeyFor(keyBytes);
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

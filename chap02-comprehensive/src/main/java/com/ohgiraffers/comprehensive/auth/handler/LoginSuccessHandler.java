package com.ohgiraffers.comprehensive.auth.handler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;


public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        /* 로그인 성공 후 저장 된 인증 객체에서 정보를 꺼낸다. */
        Map<String, Object> memberInfo = getMemberInfo(authentication);
    }

    private Map<String, Object> getMemberInfo(Authentication authentication) {

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String memberRole = userDetails.getAuthorities()
                .stream().map(auth -> auth.getAuthority().toString())
                .collect(Collectors.joining());

        return Map.of(
                "memberId", userDetails.getUsername(),
                "memberRole", memberRole
        );


    }




}

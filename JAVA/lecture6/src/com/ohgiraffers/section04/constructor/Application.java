package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        //생성자 함수가 무엇인지 이해하고 선언 및 호출할수있다.

        //1. 기본 생성자 호출
        user user1 = new user();
        System.out.println(user1.getInformation());

        //2. id,pwd,name을 매개변수로 전달받는 생성자 호출
        user user2 = new user("user01", "pass01" , "정가연");
        System.out.println(user1.getInformation());

        //3. 모든 필드를 초기화하는 매개변수 생성자 호출
        // java.util.Date 클래스의 기본 생성자를 통해 객체를 생성하면
        //현재 프로그램이 동작하는 운영체제 상의 날짜/시간 정보를 이요해 인스턴스가 생성된다
        user user3 = new user("user01", "pass01", "정가연", new Date());
        System.out.println(user3.getInformation());

        //스캐너는 매개변수가 정해져있음

    }
}

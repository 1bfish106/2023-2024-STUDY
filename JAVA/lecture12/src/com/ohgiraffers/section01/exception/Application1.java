package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {
        //예외처리 문법
        ExceptionTest et = new ExceptionTest();

        //예외처리가 강제화된 메소드가 호출된 경우 반드시 예외처리해야함
        //여기서는 throws로 예외를 위임
        et.checkEnoughMoney(1000,5000);
        //메인메소드까지 예외발생하면 프로그램이 비정상 종료됨
        //et.checkEnoughMoney(5000,1000);
        System.out.println("프로그램을 종료합니다.");
    }
}

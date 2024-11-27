package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신돈은 " + money + "원 입니다.");

        if(money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다");
        }else{
            //강제로 예외를 발생시킨다.
            //예외를 발생시키면 예외처리가 필요
            //첫번째 예외 처리방법은 throws구문 작성
            // => 예외처리를 해당 메소드를 호출하는곳으로 책임전가해서 예외처리 강제화
                 //내가 발생시키고 싶은 객체
            throw new Exception();
        }

        System.out.println("즐거운 쇼핑 되세요~");
    }
}

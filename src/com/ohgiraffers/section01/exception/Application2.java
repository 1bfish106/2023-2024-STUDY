package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        //try catch 블럭
        ExceptionTest et = new ExceptionTest();

        try {
            //try블럭에는 예외 발생 가능성이 있는 코드를 호출
            //et.checkEnoughMoney(1000,5000);
            et.checkEnoughMoney(5000,1000);

            //위의 메소드 호출시 예외가 발생하지않는경우 이후 내용을 마저 실행
            System.out.println("=====상품구입가능=====");
        } catch (Exception e) {
            //try블럭에서 예외발생시 catch블럭의 코드 실행
            //예외발생 위치 하단의 코드는 동작안함
            System.out.println("=====상품구입 불가=====");
            //e.printStackTrace();
        }
        //예외발생시 catch 블럭 실행후 프로그램 흐름으로 돌아와 정상 종료된다.
        System.out.println("프로그램을 종료합니다.");
    }
}

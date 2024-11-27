package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*메소드 리턴 값을 이해하고 활용할수있다.*/
        Application6 app6 = new Application6();
        app6.testMethod2();

        /*메소드의 반환값이 있을경우 반환값을 변수에 담을수있다.*/
        String returnText = app6.testMethod2();
        System.out.println(returnText);

        /*변수에 저장하지않고 바로 출력도 가능하다.*/
        System.out.println(app6.testMethod2());
    }

    public String testMethod2(){

        return "hello world";

    }


}

package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {
    /* 메소드 전달 인자(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출 시 사용할 수 있다. */
        /*1. 전달인자로 값 전달 테스트*/
        Application3 app3 = new Application3();
        app3.testMethod(40);
        app3.testMethod(30);
        //app3.testMethod("30");
        //app3.testMethod(20,30);
        //app3.testMethod();

        /* 2. 변수에 저장된 값 전달 테스트*/
        int age = 20;
        app3.testMethod(age);

        /* 3. 자동형변환을 이용한 값 전달 테스트*/
        byte byteAge = 10;
        app3.testMethod(byteAge);

        /* 4. 강제 형변환을 이용한 값 전달 테스트*/
        long longAge = 80;
        app3.testMethod((int)longAge);

        /*5. 연산 결과를 이용한 값 테스트*/
        app3.testMethod(age * 3);

    }


    /* int 타입의 매개변수를 전달 받는 메소드 선언 */
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }


}

package com.ohgiraffers.section05.overloading;

public class Overloadingtest {
    //오버로딩에 대해 이해할 수 있다.
    //사용이유
    //매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있는데
    //동일 기능의 메소드를 매개변수에 따라 다른이름을 붙이면 관리가 어렵기 때문에 사용한다.
    //EX

    //오버로딩 조건
    public void test(){}
    //메소드 시그니처가 같으면 compile error를 발생시킨다
    //메소드 시그니처란 ?
    // 메소드명과 파라미터 선언부를 의미하며 접근 제한자, 반환명은 오버로딩 성립요건에 해당하지않는다

    public void test(int num){}

    //매개변수 이름은 오버로딩과 무관하다
    //public void test(int num2){}

    public void test(int num1, int num2){}

    public void test(int num,String name){}
}


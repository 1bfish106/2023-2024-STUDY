package com.ohgiraffers.section01.intro;

//내부에 하나의 추상 메소드가 선언된 인터페이스만 람다식의 타깃이 된다.
//>함수적 인터페이스라고 부르며 해당 조건을 만족하는지
//컴파일시점에 체크해주는 어노테이션이 @FunctionalInterface이다.
@FunctionalInterface
//이걸 붙이게 되면 정말 이 인터페이스에 추상메소드가 하나인지 확인해준다.
public interface Calculator {

    public int sumTwoNumber(int a, int b);

    //public int minusTwoNumber(int a,int b);
    //추상메소드가 두개면 컴파일에러
}

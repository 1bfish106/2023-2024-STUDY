package com.ohgiraffer.section02.abstractClass;

//추상 클래스 선언
public abstract class product {
    //추상클래스는 필드를 가질수있다

    private  int nonStatic;
    private  static int staticF;

    //추상클래스는 생성자도 가질수있다
    //단 직접적으로 인스턴스를 생성할수는없다

    public product(){}

    //추상 클래스는 일반적인 메소드를 가질수있다.
    public void NonStatic(){
        System.out.println("product 클래스의 nonStatic 호출");

    }
    public void StaticF(){
        System.out.println("product 클래스의 StaticF 호출");
    }

    //추상 메소드 작성
    public abstract void absMethod();
    //추상 메소드가 있으면 무조건 클래스는 추상
    //추상 클래스가 있으면 선택적으로 추상 메소드를 만들수있다.

}

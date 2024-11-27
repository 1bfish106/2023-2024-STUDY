package com.ohgiraffer.section03.interfaceimplements;

public class Product implements InterProduct{
    //Product는 interProduct를 구현한다.
    @Override
    public void nonStaticMethod() {
        System.out.println("InterfaceProduct의 nonStaticMethod한 메소드 호출");
    }

    @Override
    public void absMethod() {
        System.out.println("InterfaceProduct의 absMethod한 메소드 호출");
    }


    //static메소드는 오버라이딩 할수없다.
    //@Override
    //public static void staticMethod(){}

    //default 키워드는 인터페이스 내에서만 작성 가능하다.
    //@Override
    //public default void defualtMethod(){}

    //default 구문만 빼면 구현이 가능하다.
    @Override
    public void defualtMethod(){
        System.out.println("product 클래스의 defualtMethod호출");
    }

}

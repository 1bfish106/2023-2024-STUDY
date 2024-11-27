package com.ohgiraffer.section02.abstractClass;

//추상 클래스를 상속받을 경우 추상 메소드를 반드시 오버라이딩 해야한다.
//(오버라이딩 강제성 부여)
public class SmartPhone extends product {
    @Override
    public void absMethod() {
        System.out.println("product 클래스의 absMethod를 오버라이딩 한 메소드");

    }

    //추가적으로 메소드도 작성할수있다.
    public void printSmartPhone(){
        System.out.println("스마트폰 클래스의 printSmartPhone 메소드 호출");
    }
}

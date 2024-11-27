package com.ohgiraffers.section03.overriding;

public class SuperClass {
    //클래스이름에 final이 있으면 상속 불가능
    //오버라이딩 성립조건을 이해할수있다

    //오버라이딩 테스트 기준 메소드

    public void method(int num){}

    private void privateMethod(){}

    public final void finalMethod(){}

    protected void protectedMethod(){}
}

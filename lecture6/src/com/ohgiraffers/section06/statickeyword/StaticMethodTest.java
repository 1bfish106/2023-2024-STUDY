package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("논스태틱 호출됨...");
    }
    public static void staticMethod() {
        //스태틱 메소드는 인스턴스를 생성하지않아서 this라고 지칭할만한 객체가 없음
        //this.count++;
        System.out.println("스태틱 호출됨...");
    }
}

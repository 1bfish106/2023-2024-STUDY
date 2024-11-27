package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        StaticFieldTest sf1 = new StaticFieldTest();

        System.out.println("논스태틱값 : " + sf1.getNonStaticCount());
        System.out.println("스태틱값 : " + sf1.getStaticCount());

        sf1.increaseNonStaticCount();
        sf1.increaseStaticCount();

        System.out.println("논스태틱값 : " + sf1.getNonStaticCount());
        System.out.println("스태틱값 : " + sf1.getStaticCount());

        StaticFieldTest sf2 = new StaticFieldTest();

        System.out.println("논스태틱값 : " + sf2.getNonStaticCount());
        System.out.println("스태틱값 : " + sf2.getStaticCount());

        //인스턴스 변수의 경우 sf1 과 sf2 두개의 인스턴스 생성이 될때마다 새로운 공간이 heap 영역에 할당되어
        //0으로 초기화된다 .static변수의 경우 sf1 sf2가 보두 static영역에 할당 된 하나의 공간을 공유하므로 증가된 값 1로 출력된다.

        //2. static 메소드 호출
        StaticMethodTest.staticMethod();

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();
    }
}

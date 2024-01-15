package com.ohgiraffers.generic.section01;

public class Application1 {
    public static void main(String[] args) {
        //제네릭의 사전적인 의미는 일반적이라는 의미이다
        //제네릭은 데이터 타입을 일반화

        //타입을 Integer로 하여 인스턴스 생성
        GenericTest<Integer> g1 = new GenericTest<>(); //<>object를 넣으면 를 쓰게되면
        //뒤쪽 <>에는 비워도 된다. 기본자료형을 쓰지않는다. 클래스타입도 들어갈수있다.
        g1.setValue(10);
        System.out.println(g1.getValue()); //반환타입을 object로 받게됨
        System.out.println(g1.getValue() instanceof  Integer);

        //타입을 String로 인스턴스 생성
        GenericTest<String> g2 = new GenericTest<>(); //제네릭을 쓰면 <> 여기에 여러타입을 넣어서 쓸수있어서
        g2.setValue("정가연");  //이부분만 바꾸면 셋에 들어가는 매개변수를 바꿀수있다.
        System.out.println(g2.getValue());
        System.out.println(g2.getValue() instanceof String);

        //제네릭 장점
        //데이터 형식에 의존하지않고 여러 데이터 타입을 가질수있는 기술이 중점
        //재사용성이 높음, 안정성이 높다, instanceof 쓸 필요없음
        //타입변수를 Object로 한다면 어떤 타입이던지 다 들어가서 타입 안전성이 떨어진다.
        // 그렇기 때문에 T로 하게되면 컴파일 시점에 타입검사를 시작하지만 object는 모든 타입이 가능
    }
}

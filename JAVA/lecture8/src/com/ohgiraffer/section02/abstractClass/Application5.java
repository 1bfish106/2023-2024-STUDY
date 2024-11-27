package com.ohgiraffer.section02.abstractClass;

public class Application5 {
    public static void main(String[] args) {
        //추상클래스와 추상메소드에 대해 이해할수있다.
        //추상클래스는 인스턴스 생성 불가
        //product p1 = new product();

        //추상클래스를 상속받은 객체를 이용한다.
        SmartPhone smartPhone = new SmartPhone();

        //스마트폰은 스마트폰 타입이기도 하고 프로덕트 타입이기도하다
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof product);

        //따라서 다형성을 적용해서 추상클래스를 레퍼런스 타입으로 활용할수있다.
        product p1 = new SmartPhone();
        //동적바인딩에 의해 스마트폰의 메소드가 호출된다.
        p1.absMethod();

        //추상클래스가 가지고있는 메소드도 호출할수있다.
        p1.NonStatic();
        p1.StaticF();

        //추상클래스를 사용하는 이유?
        //추상클래스의 추상 메소드는 오버라이팅에 대한 강제성이 부여된다
        //따라서 여러 클래스들을 그룹화하여 필수 기능을 정의하여 강제성을 부여한다.
        //개발시 일관된 인터페이스를 제공할수있다.

    }
}

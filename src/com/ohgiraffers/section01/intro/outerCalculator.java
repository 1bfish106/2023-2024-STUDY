package com.ohgiraffers.section01.intro;

public interface outerCalculator {
    //인터페이스는 중첩해서 선언할수있다.
    //람다식 사용을 위해 인터페이스 내에 하나의 추상메소드만 작성
    //관리해야하는 인터페이스 클래스가 많아져서 내부 인터페이스로 만들어서 관리한다.

    @FunctionalInterface
    public interface Sum{
        int sumTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus{
        int minusTwoNUmber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple{
        int multipleTwoNUmber(int a, int b);
    }

    @FunctionalInterface
    public interface Divide{
        int divideTwoNUmber(int a, int b);
    }
}

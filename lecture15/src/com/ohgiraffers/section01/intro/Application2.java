package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {
        //람다식 활용을 위한 내부 인터페이스 관리 기법

        outerCalculator.Sum sum = (x,y) -> x+y;
        outerCalculator.Minus minus = (x,y) -> x-y;
        outerCalculator.Multiple multiple = (x,y) -> x*y;
        outerCalculator.Divide divide = (x,y) -> x/y;

        System.out.println(sum.sumTwoNumber(20,10));
        System.out.println(minus.minusTwoNUmber(30,40));
        System.out.println(multiple.multipleTwoNUmber(50,60));
        System.out.println(divide.divideTwoNUmber(10,2));
    }
}

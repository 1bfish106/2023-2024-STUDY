package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /*다른 클래스에 작성 된 메소드를 호출할 수 있다.*/
        int first = 100;
        int second = 50;

        /*1. non-static 메소드 호출*/
        Calculator calculator = new Calculator();
        int min = calculator.minNumbers(first,second);
        System.out.println("둘중 최소값은 ? " + min);

        /*2. static 메소드 호출*/
        int max = Calculator.maxNumbers(first,second);
        System.out.println("둘중 최대값은 : " + max);

        /*주의사항
        * static 메소드도 non-static메소드처럼 호출이 가능하지만 권장하진않는다.*/
        int max2 = calculator.maxNumbers(first,second);
        System.out.println("둘중 최대값은 : " + max);
    }
}

package com.ohgiraffers.section03.reference;

import java.util.function.BiFunction;

public class Application1 {
    public static void main(String[] args) {
        //메소드 참조

        BiFunction<String,String,Boolean> biFunction;
        String str1 = "apple";
        String str2 = "apple";
        biFunction = (x,y) -> x.equals(y);
        System.out.println(biFunction.apply(str1, str2));

        //기존 존재하던 메소드를 함수형과 연결하는것이 가능
        //위의 람다식을 메소드 참조형태로 변경
        biFunction = String :: equals;
        System.out.println(biFunction.apply(str1, str2));
    }
}

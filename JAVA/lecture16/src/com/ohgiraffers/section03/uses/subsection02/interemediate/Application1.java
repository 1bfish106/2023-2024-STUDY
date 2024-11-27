package com.ohgiraffers.section03.uses.subsection02.interemediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        //스트림의 중계연산중 하나인 filter에 대해 이해하고 사용할수있다.
        //필터는 스트림에서 특정 데이터만 걸러내는 메소드로
        //매개변수로 받는 predicate는 boolean으로 리턴하는 함수형 인터페이스이다.
        System.out.println("======중간연산 filter()======");

        IntStream intStream = IntStream.range(0,10);
        //IntPredicate 반환값이 true,false를 반환하는 형태
        //filter()의 반환값은 앞에 스트림의 자료형을 반환함
        //              홀수값만 반환받고 싶음
        intStream.filter(i -> i % 2 != 0).forEach(i -> System.out.print(i+ " "));
    }
}

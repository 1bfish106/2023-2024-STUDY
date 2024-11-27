package com.ohgiraffers.section03.uses.subsection02.interemediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("======스트림의 중간연산 중 map()======");
        //중간연산은 여러번 사용할수있다.
        IntStream intStream = IntStream.range(1,10);
        //map은 스트림에 들어있는 데이터를 특정 람다식을 통해 가공하고 새로운 스트림에 담아주는 역할
        //중간 연산은 여러번 수행 되어도 문제없다.
        //              짝수를 고름         그 짝수에 모두 5를 곱함
        intStream.filter(i -> i % 2 == 0).map(i -> i * 5).forEach(System.out::println);
    }
}

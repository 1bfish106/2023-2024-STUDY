package com.ohgiraffers.section03.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("=====스트림의 최종연산인 reduce=====");

        //이전연산에서 반환한 값이 다음 연산의 첫번째 인자로 전달되는 연산
        OptionalInt reduceOneParam = IntStream.range(1,10)
                .reduce((a,b) -> {
                    System.out.println("a :" + a +" " + "b :" + b);
                    return Integer.sum(a,b);
                });

        System.out.println("reduceOneParam : " + reduceOneParam );

        //reduce에 인자를 2개 전달할 때는 첫번째 인자가 초기값으로 기능
        //리쥬스의 결과값이 반드시 존재하므로 옵셔널인트타입이 아닌 int타입이 반환값으로 설정
        int reducerTwoParam = IntStream.range(1,10)
                //인티저의 sum이라는 값을 매소드 참조값으로 넣음
                .reduce(100,Integer::sum);

        System.out.println("reducerTwoParam : "+reducerTwoParam);
    }
}

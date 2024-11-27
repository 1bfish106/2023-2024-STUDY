package com.ohgiraffers.section03.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("======스트림의 최종연산 calculating======");

        long count = IntStream.range(1,10).count();
        long sum = IntStream.range(1,10).sum();

        System.out.println(count);
        System.out.println(sum);

        //결과 없음을 나타내야하는 명확한 요구가 있는 메소드 반환 형식으로 OptionalInt 사용
        OptionalInt max = IntStream.range(1,10).max();
        OptionalInt min = IntStream.range(1,10).min();

        System.out.println(max);
        System.out.println(min);

        int oddSum = IntStream.rangeClosed(1,10)
                .filter(i -> i % 2 == 1)
                .sum();
        System.out.println(oddSum);
    }
}

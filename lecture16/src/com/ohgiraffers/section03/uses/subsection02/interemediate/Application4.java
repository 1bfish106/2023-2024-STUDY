package com.ohgiraffers.section03.uses.subsection02.interemediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        //sorted
        //인자없이 호출할 경우 오름차순으로 자동정렬된다.
        //Comparator를 인자로 남겨준다.
        System.out.println("======sorted=======");
        IntStream.of(5,10,99,2,1,35);

        List<Integer> integerList = IntStream.of(5,10,99,2,1,35)
                .boxed()
                //내림차순으로 바꿔준다
                .sorted((a,b) -> b-a)
                .collect(Collectors.toList());
        System.out.println(integerList);

    }
}

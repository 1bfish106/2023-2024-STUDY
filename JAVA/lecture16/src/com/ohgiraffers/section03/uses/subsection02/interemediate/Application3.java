package com.ohgiraffers.section03.uses.subsection02.interemediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {
        //flatmap
        //중첩구조를 한 단계 제거하고 단일  컬렉션으로 만들어준다 => 플래트닝(flattening)
        System.out.println("=======스트림의 중간연산 중 flatMap=======");

        //리스트의 요소가 스트링인데 그걸 다시 리스트로 담음
        //List[List[String]]
        List<List<String>> list = Arrays.asList(
                Arrays.asList("java","spring","winter"),
                Arrays.asList("full","hungry","very")
        );
        System.out.println(list);

        //제일 바깥쪽의 리스트를 스트림으로 만들어버림
        List<String> flatmap = list.stream()
                //스트림을 컬렉션으로 만들어달라
                .flatMap(Collection::stream)
                //위에값을 리스트로 만들어달라
                .collect(Collectors.toList());
        System.out.println("flatmap : " + flatmap);
    }
}

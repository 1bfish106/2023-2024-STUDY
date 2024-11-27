package com.ohgiraffers.section03.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        System.out.println("======match=====");
        List<String> stringList = Arrays.asList("java","orange","grape");
        //위에 있는 모든 요소들을 체크함
        //하나라도 p가 있으면 조건만족
        boolean anyMatch = stringList.stream().anyMatch(str -> str.contains("p"));
        //모두 맞아야하는거
        boolean allMatch = stringList.stream().allMatch(str -> str.length() > 3);
        //모두 매치가 안됐으면 좋겠다
        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("c"));

        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);
    }
}

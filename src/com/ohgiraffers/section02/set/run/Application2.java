package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;

public class Application2 {
    public static void main(String[] args) {
        //LinkedHashSet

        LinkedHashSet<String> lset = new LinkedHashSet<>();

        lset.add("java");
        lset.add("orange");
        lset.add("grape");
        lset.add("banana");
        lset.add("peach");

        //hashset이 가지는 기능을 모두 가지고 있고 저장순서를 유지한다.
        System.out.println(lset);
    }
}

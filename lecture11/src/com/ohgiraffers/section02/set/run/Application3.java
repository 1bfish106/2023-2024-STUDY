package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        //TreeSet

        TreeSet<String> tset = new TreeSet<>();

        tset.add("orange");
        tset.add("peach");
        tset.add("grape");
        tset.add("flog");
        tset.add("jadu");
        //자동으로 오름차순으로 정렬됨
        System.out.println(tset);

        //iterator 사용
        Iterator<String> iter = tset.iterator();
        //요소를 한줄로 반환함
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //TreeSet은 정렬이 된다 중복제거가 된다
        //그래서 로또번호 발생기 만들기할수있음

        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6){
            lotto.add((int) (Math.random() * 45) + 1 );
        }
        System.out.println(lotto);
    }


}

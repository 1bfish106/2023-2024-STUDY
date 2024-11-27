package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        //스트림의 병렬처리
        List<String> stringList = new ArrayList<>(Arrays.asList("apple","grape","orange","jadu"));

        //모든 작업은 기본적으로 main 스레드에서 일어난다.
        //main으로 쓰레드가 이어진다 (순회)
        System.out.println("=====foreach");
        for(String str : stringList){
            System.out.println(str + Thread.currentThread().getName());
        }
        for(String str : stringList){
            System.out.println(str +":" + Thread.currentThread().getName());
        }

        //stream도 main스레드에서 작업을 수행한다.
        System.out.println("======stream");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);

        //병렬스트림은 자동으로 병렬처리가 되고 성능상 유리하다.
        //스트림을 활용하면 병렬처리가 손쉽다는 것이 장점
        System.out.println("parallel stream=======");
        //실행할때마다 그때그때 다름
        stringList.parallelStream().forEach(Application2::print);
        stringList.parallelStream().forEach(Application2::print);

    }

    private static void print(String str1){
        System.out.println(str1 + ":" + Thread.currentThread().getName());
    }
}

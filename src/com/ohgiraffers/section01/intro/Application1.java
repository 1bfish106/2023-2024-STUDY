package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        //Stream
                                   //저걸 생성자로 받으면서 초기화    //하나의 리스트로 반환됨
        List<String> StringList = new ArrayList<>(Arrays.asList("hello","world","stream"));

        //이전에 스트림을 이용하지않던 방식
        System.out.println("======foreach");
        for(String str : StringList){
            System.out.println(str);
        }

        //Stream을 이용한 방식
        //반복문안에서 뭐할지를 컨슈머타입으로 전달한다.
        System.out.println("=====Stream");
        //람다라는 함수로 위에있는 메소드를 참조했다.
        StringList.forEach(System.out::println);


    }
}

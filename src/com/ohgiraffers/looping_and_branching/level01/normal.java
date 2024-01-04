package com.ohgiraffers.looping_and_branching.level01;

import java.util.Scanner;

public class normal {

    public void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String ch = sc.nextLine();
        int index = 0;

        while (index< ch.length()){
            char chr = ch.charAt(index);
            System.out.println(index + ":" + chr);
            index+=chr;
        }
    }

    public void test2 (){
        /* 초기값으로 ch를 'a'로 설정하고, 종료 조건으로 ch <= 'z'를 지정하여 'z'까지 반복합니다.
        반복문이 실행될 때마다 ch를 증가시켜 다음 알파벳으로 이동합니다. */
        for(char i = 'a';i <= 'z'; i++){
            System.out.print(i);
        }

    }


}

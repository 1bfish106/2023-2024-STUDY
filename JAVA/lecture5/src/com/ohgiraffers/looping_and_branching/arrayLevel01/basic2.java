package com.ohgiraffers.looping_and_branching.arrayLevel01;

import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {
        String[] test2 = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");
        int i = sc.nextInt();

        if(i > 4 || i < 0){
            System.out.println("준비된 과일이 아닙니다.");
            return;
        }
        System.out.println(test2[i]);
    }
}


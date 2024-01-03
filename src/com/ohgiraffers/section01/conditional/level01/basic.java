package com.ohgiraffers.section01.conditional.level01;

import java.util.Scanner;

public class basic {

    public void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");
        int inum = sc.nextInt();
        if(inum>0){
            System.out.println("양수다.");
        }else if (inum<0){
            System.out.println("양수가 아니다");
        }

    }

    public void test2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");
        int inum = sc.nextInt();
        if(inum % 2 == 0){
            System.out.println("짝수다.");
        } else if (inum % 2 == 1){
            System.out.println("홀수다");
        }

    }
}

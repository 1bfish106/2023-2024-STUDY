package com.ohgiraffers.section01.conditional.level01;

import java.util.Scanner;

public class advanced {

    public void test1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요 : ");
        int korean = sc.nextInt();
        System.out.println("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();
        System.out.println("영어점수를 입력하세요 : ");
        int english = sc.nextInt();

        int sum = (korean+math+english)/3;

        if (sum>=60){
            if (korean >= 40 && math>=40 && english>=40){
                System.out.println("합격입니다!");
            }
            }else if (sum<60){
            System.out.println("평균점수 미달로 불합격입니다.");
             }else if (korean < 40? math > 40 : english > 40){
            System.out.println("  " + "의 점수미달로 불합격 입니다.");
        }
        }

    }

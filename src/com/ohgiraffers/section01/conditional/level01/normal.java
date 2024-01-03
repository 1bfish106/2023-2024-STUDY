package com.ohgiraffers.section01.conditional.level01;

import jdk.jshell.Snippet;

import java.util.Random;
import java.util.Scanner;

public class normal {

    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");
        Random random = new Random();
        int randomNumber1 = random.nextInt()*10+1;
        int inum1 = sc.nextInt();

        if(inum1>1 && inum1 <10){

            if (inum1 % 2 == 0) {
                System.out.println("짝수다.");
            }else if (inum1 % 2 != 0){
                System.out.println("홀수다.");
            }
        }System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");


    }

    public void test2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 몸무게를 입력하세요 : ");
        double weight = sc.nextDouble();
        System.out.println("당신의 키를 입력하세요 : ");
        double height = sc.nextDouble();
        double bmi = weight * height / height;

        String grade = "";

        if (bmi < 20) {
            System.out.println("당신은 저체중입니다.");
        }else if (bmi>=20 && bmi<25){
            System.out.println("당신은 정상체중입니다.");
        }else if (bmi>=25 && bmi<30){
            System.out.println("당신은 과체중입니다.");
        }else if (bmi>=30){
            System.out.println("당신은 비만입니다.");
        }
    }

}


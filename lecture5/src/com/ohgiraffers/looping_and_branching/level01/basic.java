package com.ohgiraffers.looping_and_branching.level01;

import java.util.Random;
import java.util.Scanner;

public class basic {

    public void test1() {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;

        }
        System.out.println("1부터 10까지의 합은 : " + sum);
    }

    public void test2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int inum = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= inum; i++) {
            sum += i;

        }
        System.out.println("1부터" + inum + "까지의 합은" + sum);

    }

    public void test3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int inum = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= inum; i++) {
            if (i % 2 == 0) {
                sum += i++;
            }
        }
        System.out.println("1부터" + inum + "까지의 합은" + sum);


        //다른방법//
       // Scanner sc = new Scanner(System.in);
        //System.out.println("정수를 입력하세요 : ");
        //int num = sc.nextInt();

        //int total = 0;

       // for (int i = 2; i <= num; i += 2) {
           // total += i;
        }
        //System.out.println(" 1 부터 " + num + " 까지 짝수의 합 : " + total);
    }


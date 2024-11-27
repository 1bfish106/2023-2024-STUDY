package com.ohgiraffers.section01.conditional.level01;

import java.util.Scanner;

public class hard {

    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.println("두번째 정수를 입력하세요 : ");
        int second = sc.nextInt();
        System.out.println("연산기호(+,-,*,/,%)를 입력하세요 : ");
        char op = sc.next().charAt(0);

        int result = 0;


        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '/':
                result = first / second;
                break;
            case '*':
                result = first * second;
                break;
            case '%':
                result = first % second;
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                return;
        }
        System.out.println(first + "" + op + " " + second + "=" + result);
    }

    public void test2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("과일을 입력하세요 : ");
        String fruit = sc.nextLine();

        int price = 0;

        switch (fruit) {
            case "사과":
                price = 1000;
                break;
            case "바나나":
                price = 3000;
                break;
            case "복숭아":
                price = 2000;
                break;
            case "키위":
                price = 5000;
                break;
            default:
                System.out.println("준비된 상품은 없습니다.");
        }
        System.out.println(fruit + "을 선택하셨습니다.");
        System.out.println("가격은 " + price + "입니다.");
    }
}
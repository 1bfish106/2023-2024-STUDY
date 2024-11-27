package com.greedy.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        Calculaor calculaor1 = new Calculaor();
        //메소드 호출 확인용 메소드 호출
        calculaor1.checkMethod();

        //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        int inum1 = 1;
        int inum2 = 2;
        int inum3 = 3;
        int inum4 = 4;
        int inum5 = 5;
        int inum6 = 6;
        int inum7 = 7;
        int inum8 = 8;
        int inum9 = 9;
        int inum10 = 10;

        int allSum = calculaor1.allSumNumbers(inum1,inum2,inum3,inum4,inum5,inum6,inum7,inum8,inum9,inum10);
        System.out.println("1부터 10까지의 합은 : " + allSum);
        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        int first = 10;
        int second = 20;

        int max = calculaor1. checkMaxNumber(first,second);
        System.out.println("둘중 최댓값은 : " + max);
        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력

        int sum1 = calculaor1. sumTwoNumber(first,second);
        System.out.println("두 값의 합은 : " + sum1);

        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        int first1 = 10;
        int second2 = 5;
        int minus = calculaor1.minusTwoNumber(first1,second2);
        System.out.println("두 값의 차는 : " + minus);
    }
}

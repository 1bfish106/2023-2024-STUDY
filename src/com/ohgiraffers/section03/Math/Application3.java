package com.ohgiraffers.section03.Math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /*java.util.Random 클래스를 활용하여 난수를 발생시킬수 있다.*/
        /*nextInt(int bound) : 0부터 매개변수로 전달 받은 정수 범위까지의 난수를 발생시켜 정수 형태로 반환
        * 공식 : random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값*/
        Random random = new Random();

        /*1. 0~9 범위의 난수 발생*/
        int rnum1 = random.nextInt(10);
        System.out.println("0에서 9까지의 난수 : " + rnum1);

        /*2. 1~10 범위의 난수 발생*/
        int rnum2 = random.nextInt(10)+1;
        System.out.println("1에서 10범위의 난수 : " + rnum2);
    }
}

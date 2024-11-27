package com.ohgiraffers.looping_and_branching.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /*5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램*/

        //5명의 배열
        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++){
            System.out.println((i + 1) + "번째 학생의 자바 점수 입력 : ");
            scores[i] = sc.nextInt();
        }

        //합계 초기화
        int sum = 0;
        //평균 초기화
        double avg = 0.0;

        //합계 반복 돌리기
        for(int i = 0; i < scores.length; i++){
            sum+=scores[i];
        }
        //평균값 구하기
        avg = (double) sum / scores.length;
        //실행하기
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }

}

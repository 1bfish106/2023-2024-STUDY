package com.ohgiraffers.section01.ifElseIf;

import java.util.Scanner;

public class ex_grade {
    public void testNestedIfElseIfStatement() {
        /*중첩된 if-else-if 문의 흐름을 이해하고 적용할수있다.
         * 90점 이상이면 'A' , 80점이상이면 'B', 70점 이상이면 'C' 60점 이상이면 'D' 60점 미만이면 'F' */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수 입력 : ");
        int point = sc.nextInt();

        /*학생의 등급을 저장하기 위한 변수 선언 및 초기화*/
        String grade = "";


        if (point >= 90) {
            grade = "A";
            if(point >= 95){
                grade += "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if(point >= 85){
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if(point >= 75){
                grade += "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if(point >= 65){
                grade += "+";
            }
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는" + point + "점이고, 등급은 " + grade + "입니다.");
    }

    public void improveNestedIfElseIfStatement() {
        /* 위의 메소드를 개선한다.
         * 90점 이상이면 'A' , 80점이상이면 'B', 70점 이상이면 'C' 60점 이상이면 'D' 60점 미만이면 'F' */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("학생의 점수 입력 : ");
        int point = sc.nextInt();

        /*학생의 등급을 저장하기 위한 변수 선언 및 초기화*/
        String grade = "";


        if (point >= 90) {
            grade = "A";
        } else if (point >= 80) {
            grade = "B";
        } else if (point >= 70) {
            grade = "C";
        } else if (point >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if(point % 10 >= 5 && point >= 60 || point == 100){
            grade += "+";
        }

        System.out.println(name + " 학생의 점수는" + point + "점이고, 등급은 " + grade + "입니다.");
    }
}

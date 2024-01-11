package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Applicaiton {
    public static void main(String[] args) {
        StudentDTO[] studentDTOS = new StudentDTO[10];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("학년 : ");
            int grade = sc.nextInt();
            System.out.println("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.println("이름 : ");
            String name = sc.nextLine();

            System.out.println("국어점수 : ");
            int kor = sc.nextInt();
            System.out.println("영어점수 : ");
            int eng = sc.nextInt();
            System.out.println("수학점수 : ");
            int math = sc.nextInt();

            studentDTOS[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            while (true) {
                System.out.println("계속 추가할겁니까?");
                char str = sc.next().charAt(0);
                sc.nextLine();

                if (str == 'n' || count == 10) {
                    System.out.println("=====입력생략=====");
                    for (int i = 0; i < count; i++) {
                        System.out.println(studentDTOS[i].getInformation());
                        break;
                    }
                    return;
                }
                if (str == 'y') {
                    break;
                }
            }
        }
    }
}


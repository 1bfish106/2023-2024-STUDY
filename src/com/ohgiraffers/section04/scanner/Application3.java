package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*스캐너 사용시 주의사항에 대해 이해하고 고려하여 사용할 수 있다.*/

        /*스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서 읽어온다.
        * 그래서 크게 두가지 사항을 주의해야 한다.
        * 1. next()로 문자열 입력 받은 후 정수,실수,논리값 입력 받을때
        * 2. 정수,실수,논리값 입력 후 nextLine()으로 문자열 입력 받을때
        * */

        Scanner sc = new Scanner(System.in);

        //* 1. next()로 문자열 입력 받은 후 정수,실수,논리값 입력 받을때
    //    System.out.print("문자열을 입력해주세요 : ");
     //   String str1 = sc.nextLine();
     //   System.out.println("str1 : " + str1);

     //   System.out.print("숫자를 입력해주세요 : ");
     //   int inum = sc.nextInt();
     //   System.out.println("inum1 : " + inum);

        /*공백을 포함한 문자열을 입력하게 되면 입력버퍼에 남아있는 문자열로 인해 nextInt()메소드가
        * 해당값을 숫자로 변경하지 못해 java.util.InputMismatchException 이 발생할수있는 가능성이 있다*/

        /*2. 정수, 실수 , 논리값 입력후 nextLine()으로 문자열 입력 받을때*/
        System.out.print("숫자를 입력해주세요 : ");
        int inum2 = sc.nextInt();
        System.out.println("inum2 : " + inum2);

        sc.nextLine(); // 입력 버퍼를 읽어서 버린다.

        System.out.print("문자열을 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);

        /*입력버퍼에 남아있는 개행문자로 인해 이어지는 nextLine()이 아무값도 입력 받지않고 빈 문자열로 처리된다.
        * => 입력 버퍼에 남은 개행문자를 사전에 읽고 버린다. */
    }
}

package com.ohgiraffers.looping_and_branching.section04.sort;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {
        //배열 정렬하기
        int[] iarr = {4,5,2,6,1,3};
        //Arrays의 클래스의 sort라는 메소드를 사용하여 정렬
        Arrays.sort(iarr);
        System.out.println(Arrays.toString(iarr));


        //정렬 알고리즘 학습에 앞서 변수의 두 값을 변경하는 방법에 대해 먼저 학습한다.
        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        //두변수의 값을 바꾸기 위해서는 다른 변수가 하나 더 필요하다
        int tmp = num1;
        num1= num2;
        num2 = num1;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        //배열의 인덱스에 있는 값도 서로 변경할수있다.
        int[] arr = {2,1,3};

        //0번 인덱스를 만들어서 저장할공간을 만듦
        int tmp2 = arr[0];
        //0에 1인덱스값을 넣고 1인덱스는 tmp2에 넣는다
        arr[0]=arr[1];
        arr[1]=tmp2;

        System.out.println(Arrays.toString(arr));
    }
}

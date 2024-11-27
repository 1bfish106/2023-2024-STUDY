package com.ohgiraffers.looping_and_branching.section04.sort;

import java.util.Arrays;
import java.util.Random;

public class Application6 {
    public static void main(String[] args) {
        //중복 제거
        //5개 길이의 배열에 1~10사이의 랜덤 값을 '중복 값 없이' 담기
        int[] iarr = new int[5];

        for ( int i = 0; i < iarr.length; i++){
            iarr[i] = (int) (Math.random() * 10) +1;
            //앞과 뒤에 값을 비교하여 같으면 다시 실행
            for( int j = 0; j < i; j++){
                if(iarr[i] == iarr[j]){
                    System.out.println(j+ "인덱스와" + i + "인덱스의 값" + iarr[i] + "로 중복 발생");
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(iarr));
    }
}

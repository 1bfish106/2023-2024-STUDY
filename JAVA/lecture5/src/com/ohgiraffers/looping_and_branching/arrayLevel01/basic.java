package com.ohgiraffers.looping_and_branching.arrayLevel01;

import java.util.Scanner;

public class basic {

    public static void main(String[] args) {
        int[] arr1 = new int[10];

        int value = 0;

       for( int i = 0; i < arr1.length; i++){
           arr1[i] = value++;
           System.out.print(value + "  ");
       }
    }
}

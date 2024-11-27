package com.ohgiraffers.level02.normal;

public class Application2 {

    public static void main(String[] args) {
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        double result1 = (korean + math + english);
        double result2 = (korean + math + english)/3;

        int result3 = (int)(result1);
        int result4 = (int)(result2);

        System.out.println(result3);
        System.out.println(result4);

    }
}

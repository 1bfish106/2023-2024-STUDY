package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /*매개변수와 리턴값을 복합적으로 활용해볼수있다.*/
        int first = 10;
        int second = 20;

        Application7 app7 = new Application7();

        System.out.println(app7.testMethod3(first, second));
        System.out.println(app7.testMethod4(first, second));
        System.out.println(app7.testMethod5(first, second));

    }

    public int testMethod3(int first, int second) {

        return first + second;
    }

    public int testMethod4(int first, int second) {

        return first - second;
    }

    public int testMethod5(int first, int second) {

        return first * second;
    }
}


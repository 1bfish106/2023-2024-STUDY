package com.ohgiraffers.looping_and_branching.section03.copy;

public class Application2 {
    public static void main(String[] args) {
        //얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.

        String[] names = {"홍길동", "유관순", "이순신"};
        System.out.println("names의 hashcode는 " + names.hashCode());

        //1. 인자와 매개변수로 활용
        print(names);

        //2. 리턴 값으로 활용
        String[] animals = getAnimals();

        System.out.print("리턴받은 animals의 hashcode : " + animals.hashCode());

        print(animals);

    }

    public static void print(String[] sarr) {

        System.out.println("sarr의 hashcode는 " + sarr.hashCode());

        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + "  ");
        }
        System.out.println();
    }

    public static String[] getAnimals() {

        String[] annimals = new String[]{"낙타", "호랑이", "나무늘보"};

        System.out.println("animals 의 hashcode : " + annimals.hashCode());

        return (annimals);
    }
}
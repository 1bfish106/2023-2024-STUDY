package com.ohgiraffers.section08.initblock;

public class Application {
    public static void main(String[] args) {
        //초기화 블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할수있다.

        //기본생성자로 인스턴스 생성
        Produck produck = new Produck();
        System.out.println(produck.getInfomation());

        //매개변수 생성자로 인스턴스 생성
        Produck produck1 = new Produck("대륙폰", 300000, "샤오미");
        System.out.println(produck1.getInfomation());
    }
}

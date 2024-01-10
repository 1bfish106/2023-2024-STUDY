package com.ohgiraffer.section01.polymorphism;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 왠만해선 달리지않습니다.");
    }

    @Override
    public void cry() {
        System.out.println("어흥");
    }

    public void bite() {
        System.out.println("와구와구냠냠");
    }
}

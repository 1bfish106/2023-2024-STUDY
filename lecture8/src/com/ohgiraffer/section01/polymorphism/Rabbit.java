package com.ohgiraffer.section01.polymorphism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다. 깡총");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 웁니다. 낑낑");
    }

    public void jump(){
        System.out.println("토끼가 점프합니다. 점프!!!!!!!!!!!!!!");
    }




}

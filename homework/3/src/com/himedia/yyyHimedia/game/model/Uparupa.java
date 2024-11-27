package com.himedia.yyyHimedia.game.model;

public class Uparupa extends Animal{

    public Uparupa () {
    }


    @Override
    public String toString(){
        return "우파루파";
    }

    @Override
    public void eat() {
        System.out.println(getName() +" 가 플랑크톤을 먹습니다, 냠냠~");
    }

    @Override
    public void wash() {
        System.out.println(getName() +" 를 씻깁니다. 첨벙첨벙");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " 를 재웁니다.. 잘자~");
    }

    @Override
    public void play() {
        System.out.println(getName() +" 와 기포놀이를 합니다! 뽀글뽀글!~");
    }
    public void swim(){
        System.out.println(getName() + " 이 헤엄쳐 바다로 돌아갑니다...잘가....");
    }
}

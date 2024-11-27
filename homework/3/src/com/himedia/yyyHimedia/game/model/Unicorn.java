package com.himedia.yyyHimedia.game.model;

public class Unicorn extends Animal {

    public Unicorn() {
    }

    @Override
    public String toString() {
        return "유니콘";
    }

    @Override
    public void eat() {
        System.out.println(getName() +" 이 황금당근을 먹습니다. 으드득으드득");
    }

    @Override
    public void wash() {
        System.out.println(getName() +" 을 씻기다 뿔에 치였습니다! 으악!!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() +" 이 잠을 잡니다..zzz 잘자");

    }

    @Override
    public void play() {
        System.out.println(getName() +" 과 산책을 합니다! 달려");
    }

    public void trip(){
        System.out.println(getName() + " 이 만원의행복으로 취직을 했습니다.");
    }
}

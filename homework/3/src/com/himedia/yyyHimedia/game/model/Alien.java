package com.himedia.yyyHimedia.game.model;

public class Alien extends Animal {

    public Alien() {
    }

    @Override
    public String toString() {
        return "외계인";
    }

    @Override
    public void wash() {
        System.out.println(getName() + " 이 샤워해서 청결해졌습니다. 하얘졌다!");
    }

    @Override
    public void eat() {
        System.out.println(getName() +" 이 인간을 먹습니다. 우리는 잠시 비켜줍시다..");
    }

    @Override
    public void play() {
        System.out.println(getName() +" 이 인간수업을 듣습니다.. ");
    }

    @Override
    public void sleep() {

        System.out.println(getName() +" 을 재웁니다~ 빨리 자렴~");
    }

    public void leave(){
        System.out.println(getName() + " 이 우주선을 타고 날아갑니다~~");
    }









}


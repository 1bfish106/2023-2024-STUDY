package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {
    public RacingCar(){
        System.out.println("RacingCar클래스의 기본 생성자 호출...");
    }
    //모든 행동 오버라이딩
    @Override
    public void run(){
        System.out.println("레이싱카가 전속력으로 질주합니다");
    }

    @Override
    public void soundHorn(){
        System.out.println("레이싱카는 경적을 울리지않습니다");
    }

    @Override
    public void stop(){
        System.out.println("레이싱카가 폭파되었습니다.");
    }

}


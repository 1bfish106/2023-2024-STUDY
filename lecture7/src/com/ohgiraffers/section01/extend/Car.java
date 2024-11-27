package com.ohgiraffers.section01.extend;

public class Car {
    //모든 클래스는 object라는 클래스의 후손이다
    private boolean runningSatus; //달리는상태

    public Car(){
        System.out.println("Car클래스의 기본생성자 호출...");
    }
    public void run(){
        runningSatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵!,빵!");
        }else{
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴수 없습니다.");

        }
    }

    /*private*/protected boolean isRunning(){
        return runningSatus;
    }

    public void stop(){
        runningSatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}

package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();

    public void startUp() {car.startUp();}
    //차의 시동을 걸수있다

    public void stepAccelator() {
        car.go();
    }
    //차의 엑셀을 밟을수있다

    public void stepBreak(){
        car.stop();
    }
    //차의 브레이크를 밟을수있다

    public void turnOff(){
        car.turnOff();
    }
    //차의 시동을 끌수있다.
}

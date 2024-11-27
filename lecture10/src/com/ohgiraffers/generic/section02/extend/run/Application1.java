package com.ohgiraffers.generic.section02.extend.run;

import com.ohgiraffers.generic.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        //extends 키워드를 사용하여 제네릭 범위 넓히기

        //래빗의 상위타입이거나 관련없는 타입이나 인스턴스는 안됨
        //RabbitFarm<Animal> farm1 = new RabbitFarm();
        //RabbitFarm<Mammal> farm2 = new RabbitFarm();
        //RabbitFarm<Snake> farm3 = new RabbitFarm();

        //래빗타입이거나 래빗의 후손타입
        RabbitFarm<Rabbit> farm1 = new RabbitFarm();
        RabbitFarm<Bunny> farm2 = new RabbitFarm();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm();

        //셋애니멀 안에는 불러오는 클래스를 적는다.
        farm1.setAnimal(new Rabbit());
        farm1.getAnimal().cry();

        farm2.setAnimal(new Bunny());
        farm2.getAnimal().cry();

        farm3.setAnimal(new DrunkenBunny());
        farm3.getAnimal().cry();

    }
}

package com.ohgiraffers.generic.section02.extend;

//래빗만 상속받는 클래스만 제네릭 할수있음
//인터페이스를 상속받는 implemens를 쓰게 되면 컴파일이 나게됨
//그래서 똑같이 extends로 쓴다.
public class RabbitFarm <T extends Rabbit> {

    //타입변수는 어떤 토끼가 될지 모름 근데 래빗후손만 됨
    private T animal;

    public RabbitFarm(){
    }

    public RabbitFarm(T rabbit) {
        this.animal = animal;
    }

    public void setAnimal(T animal){
        this.animal = animal;
    }
    public T getAnimal(){
        return animal;
    }
}

package com.ohgiraffer.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        //다형성을 적용하여 객체배열을 만들어 인스턴스를 연속 처리할수있다.
        Animal[] animals = new Animal[5];

        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        //Animal클래스가 가지는 메소드를 오버라이딩한 메소드가 호출된다 - 동적바인딩
        for(int i = 0; i < animals.length; i++){
            animals[i].cry();
        }

        //각 타입별로 고유한 메소드를 동작시키기 위해서는 다운캐스팅이 명시적으로 필요하다
        //ClassCastException을 방지하기 위해 instancof를 사용한다.

        for(int i = 0; i <animals.length; i++){
            if(animals[i] instanceof Rabbit){
                ((Rabbit)animals[i]).jump();
            }else if(animals[i] instanceof Tiger){
                ((Tiger)animals[i]).bite();
            }else{
                System.out.println("토끼나 호랑이가 아닙니다.");
            }
        }


    }


}

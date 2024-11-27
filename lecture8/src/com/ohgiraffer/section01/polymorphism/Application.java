package com.ohgiraffer.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        System.out.println("Animal 생성======");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("토끼생성===");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("호랑이생성===");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        //토끼랑 호랑이는 Animal 클래스를 상속받음
        //토끼는 토끼이면서 Animal 이기도 하다
        //호랑이는 호랑이면서 Animal 이기도 하다

        //부모타입으로 자식 인스턴스의 주소값을 참조할수있다.
        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        //하지만 반대는 안된다
        //Rabbit a = new Animal();

        //컴파일 당시에는 해당 타입의 메소드와 연결되어있다가(정적바인딩)
        //런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작하는것을 목적 바인딩이라고 한다.
        System.out.println("동적바인딩 확인===");
        a1.cry();
        a2.cry();
        //현재 레퍼런스 변수타입은 Animal이기 때문에 토끼와 호랑이가 가진 고유한 기능을 호출하지못한다.
       // a1.jump();
        //a2.bite();

        //타입 형변환
        //객체별로 고유한 기능을 동작시키기 위해 레퍼런스변수를 토끼와 호랑이로 형변환
        System.out.println("클래스 형변환 확인====");
        ((Rabbit)a1).jump();
        ((Tiger)a2).bite();

        //타입 형변환을 잘못하는 경우
        //컴파일 에러는 발생하지않지만 런타임에러가 발생한다. java.lang.ClassCastException
        //((Tiger)a1).bite();

        //레퍼런스변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 instanceof 연산자
        System.out.println("instanceof 연산자 확인===");
        System.out.println("a1이 토끼인지 타입확인 : " + (a1 instanceof Rabbit));
        System.out.println("a1이 호랑이인지 타입확인 : " + (a1 instanceof Tiger));
        System.out.println("a2이 토끼인지 타입확인 : " + (a2 instanceof Rabbit));
        System.out.println("a2이 호랑이인지 타입확인 : " + (a2 instanceof Tiger));
        //상속받은 타입도 함께 가지고있다.
        System.out.println("a1이 Animal인지 타입확인 : " + (a1 instanceof Animal));
        System.out.println("a2가 Animal인지 타입확인 : " + (a2 instanceof Animal));
        //모든 클래스는 오브젝트의 후손이다.
        System.out.println("a1이 object인지 타입확인 : " + (a1 instanceof Object));
        System.out.println("a2가 object인지 타입확인 : " + (a2 instanceof Object));

        //instanceof연산자를 이용해서 해당 타입이 맞는 경우에만 클래스 형변환을 적용한다.
        if(a1 instanceof Rabbit){
            ((Rabbit)a1).jump();
        }

        if(a2 instanceof Tiger){
            ((Tiger)a2).bite();
        }

        //클래스의 업캐스팅과 다운캐스팅
        //up-casting : 상위 타입으로 형변환(묵시적 형변환)
        //down-casting : 하위 타입으로 형변환(명시적 형변환)

        Animal animal1 = (Animal) new Rabbit(); //up-casting
        Animal animal2 = new Rabbit();          //up-casting 묵시적형변환 가능

        Rabbit rabbit1 = (Rabbit) new Animal(); //down-casting
       // Rabbit rabbit2 = animal2;          //down-casting은 반드시 명시적으로 작성해야된다


    }
}

package com.ohgiraffers.generic.section01;
//제네릭 선언은 클래스 선언부 마지마게 다이아몬드 연산자를 이용하여 작성
//내부에 작성하는 영문자는 대문자
//T는 타입변수 자료형대신 사용
//T는 가상타입이라 다른문자를 써도된다
//타입변수 여러개 가능
public class GenericTest<T> {

    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    //사용하는 쪽에서 작성한 제네릭 클래스를 이용할때 실제 사용할 타입을
    //타입변수 자리에 넣어주게 되면 컴파일 시점에 타입이 결정된다.

}

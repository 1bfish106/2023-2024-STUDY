package com.ohgraffers.section01.section02.enumtype;

import com.ohgraffers.section01.inrenum.Foods;

public class Application2 {
    public static void main(String[] args) {
        //열거형(enum)을 이용하여 상수 열거 패턴의 단점을 해결

        //1. 열거 타입은 싱글톤 방식으로 구현되기 떄문에 인스턴스의 생성이나 확장이 되지않는다
        //싱글톤 : 프로젝트에서 오로지 객체가 하나만 만들어짐

        //2. 열거타입은 컴파일 타입의 타입 안정성을 높여준다.
        boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.DRINK_RADISH_KIMCHI_LATTE);
     //   boolean isTrue = enumTest(0,3); -> 정수 상수 값고 일치하는 값을 전달해도 타입이 불일치해서 사용할수있다.
        System.out.println(isTrue ? "같은 값" : "다른 값");

        //3. 열거타입은 상수 이름을 문자열로 출력가능
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(FoodsEnum.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);

        //4. 열거타입에 메소드나 필드를 추가할수있다.
        //근본적으로 불변이라 모든 필드는 final이어야만 한다.

        //5. 열거타입도 클래스이기 때문에 toString()을 재정의 해서 사용할수있다.
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW.toString());

        //6. 열거타입에 선언 된 상수를 제거하더라고 삭제 된 상수를 참조하고 있는곳에 컴파일에러르 출력해주므로 안전하다.

        //7. 열거타입 내에 선언된 상수들을 순회할수있다.
        for(FoodsEnum food : FoodsEnum.values()){
            System.out.println(food);
        }




    }

    private static boolean enumTest(FoodsEnum foodsEnum1, FoodsEnum foodsEnum2){
        if(foodsEnum1 == foodsEnum2){
            return true;
        }
        return false;
    }



}

package com.ohgraffers.section03.grammer;

import com.ohgraffers.section01.inrenum.Foods;

import java.util.EnumSet;
import java.util.Iterator;

public class Application2 {
    public static void main(String[] args) {
        //열거상수는 열거객체이므로 생성자를 이용해 열거상수에 여러값을 넣을수 있다.
        //여기에서는 value, name필드에서 설정하고 초기화 했다
        for(FoodsEnum food : FoodsEnum.values()){
            System.out.println(food.getName()+food.getValue());
        }


        //Enumset을 활용하여 enum을 Set자료구조로 가져올수있다.

        //열거타입으로 모든 상수를 set에 추가
        //.class를 하면 클래스를 반환한다.
        EnumSet<FoodsEnum> foods = EnumSet.allOf(FoodsEnum.class);
        Iterator<FoodsEnum> iter = foods.iterator();
        while(iter.hasNext()){
            FoodsEnum foodsEnum = iter.next();
            System.out.println(foodsEnum + foodsEnum.getName());
        }

        System.out.println("========================================");

        //특정 상수값을 set에 추가
        EnumSet<FoodsEnum> foods2 = EnumSet.of(FoodsEnum.DRINK_WOOLUCK_SMOOTHIE,FoodsEnum.DRINK_RADISH_KIMCHI_LATTE);
        Iterator<FoodsEnum> iter2 = foods2.iterator();
        while(iter2.hasNext()){
            FoodsEnum foodsEnum = iter2.next();
            System.out.println(foodsEnum + foodsEnum.getName());
        }

        System.out.println("========================================");

        //특정 상수값을 제외하고 set에 추가
        EnumSet<FoodsEnum> foods3 = EnumSet.complementOf(EnumSet.of(FoodsEnum.DRINK_WOOLUCK_SMOOTHIE,FoodsEnum.DRINK_RADISH_KIMCHI_LATTE));
        Iterator<FoodsEnum> iter3 = foods3.iterator();
        while(iter3.hasNext()){
            FoodsEnum foodsEnum = iter3.next();
            System.out.println(foodsEnum + foodsEnum.getName());
        }


    }
}

package com.ohgraffers.section01.section02.enumtype;

import java.util.Locale;

public enum FoodsEnum {
    //작성순서대로 0부터 값이 자동으로 부여된다.
    //얘는 벨루값 ~~로 초기화할것이다.
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),
    DRINK_RADISH_KIMCHI_LATTE(0),
    DRINK_WOOLUCK_SMOOTHIE(1),
    DRINK_RAW_CUTTLEFISH_SHAKE(2);
    //코드를 구분하기 위해 세미콜론을 꼭 찍어야한다.
    //뒤에 필드를 더 추가하기위해 세미클론을 찍고 그 뒤에 작성


    //final은 생성시 바로 초기화를 해야댐
    private final int value;

    private final int var = 10;

    //초기화 생성자를 만듦
    FoodsEnum(int value) {
        this.value = value;
    }

    public void printVar(){
        System.out.println(var);
    }

    @Override
    public String toString(){
        return this.name().toLowerCase(Locale.ROOT);
    }



}

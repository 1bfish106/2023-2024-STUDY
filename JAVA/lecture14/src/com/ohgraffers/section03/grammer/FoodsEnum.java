package com.ohgraffers.section03.grammer;

import java.util.Locale;

public enum FoodsEnum {
    //작성순서대로 0부터 값이 자동으로 부여된다.
    //얘는 벨루값 ~~로 초기화할것이다.
    MEAL_AN_BUTTER_KIMCHI_STEW(0,"앙버터김치찜"),
    MEAL_MINT_SEAWEED_SOUP(1, "민트미역국"),
    MEAL_BUNGEOPPANG_SUSHI(2,"붕어빵초밥"),
    DRINK_RADISH_KIMCHI_LATTE(0,"열무김치라떼"),
    DRINK_WOOLUCK_SMOOTHIE(1,"우럭스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE(2,"생갈치쉐이크");

    //코드를 구분하기 위해 세미콜론을 꼭 찍어야한다.
    //뒤에 필드를 더 추가하기위해 세미클론을 찍고 그 뒤에 작성


    //final은 생성시 바로 초기화를 해야댐
    private final int value;

    private final String name;

    //초기화 생성자를 만듦
    FoodsEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }


}

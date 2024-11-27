package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        int num = 129;

        //1.9버전부터 Deprecated 됨 아니 그럼 제일 최신버전부터 가르쳐줘야지 염병이네
        //Integer num1 = new Integer(num);

        //Boxing : int 를 Integer로 만든다
        Integer num1 = Integer.valueOf(num);
        Integer num2 = num;
        //원래 데이터타입은 좌와 우가 같아야하는데 오토박싱 처리가 되기떄문에 그냥 Integer를 넣으면 알아서됨

        //un-Boxing : Integer을 int로 만든다
        int num3 = num1.intValue();
        int num4 = num2;
        //형변환이랑 비슷한듯

        //valueOf 메소드가 byte 범위의 숫자를 캐싱하고있어 10인경우 true가 나옹지만
        //기본적으로 인스턴스를 비교하는 것은 주소 값 비교이므로 byte값 이상일 경우 false가 나옴
        //항상 원칙적으로 주소비교를 하고있기때문에 equals를 쓴다.
        System.out.println(num1 == num2);  // 타입비교
        System.out.println(num2 == num3);  // 값비교
        System.out.println(num3 == num4);  // 값비교

        //동등비교 - > 값비교를 하고싶으면 equals를 쓴다
        System.out.println(num1.equals(num2));
    }
}

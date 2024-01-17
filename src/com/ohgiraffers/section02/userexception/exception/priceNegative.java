package com.ohgiraffers.section02.userexception.exception;

//사용자 정의 예외 클래스를 만들기 위해서는 exception클래스의 상속을 받는다
//경우에 따라서는 더 상위 타입인 Throwable 클래스나 하위타입인 RuntimeException 클래스를 상속받음
//런타임익셉션을 상속할경우엔 예외처리가 강제화되진않는다
public class priceNegative extends negativeException {

    public priceNegative(String message){
        //상위타입으로 전달된 메세지는 쓰루어블의 디테일메세지라는 필드에 설정된다.
        super(message);
    }

}

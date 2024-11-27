package com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        //1. 기본생성자 사용 - 운영체제의 날짜/시간 정보를 이용해서 인스턴스 생성
        Date today = new Date();
        System.out.println(today);

        //2. Date(long date) 사용 : long타입의 숫자로 전달 된 날짜/시간으로 인스턴스 생성
        //1970년 1월 1일 0시 0분 0초가 지난 시간을 밀리세턴드로 계산해서 long타입으로 반환한다.
        System.out.println(today.getTime());

        Date time = new Date(1705038427180L); //나오는 숫자를 넣어서 만들었기때문에 이걸 출력했을땐 그때의 시간이 나온다
        System.out.println(time);  // 0으로 생성했을때는 기준이 되는 날짜에 우리는 세계시간보다 9시간 빠르기 때문에 9시로 나온다.



    }
}

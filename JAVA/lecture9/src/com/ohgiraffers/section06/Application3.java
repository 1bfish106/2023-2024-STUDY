package com.ohgiraffers.section06;

import java.time.LocalDateTime;

public class Application3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
        LocalDateTime localDateTime2 = localDateTime.minusHours(3);
        LocalDateTime localDateTime3 = localDateTime.withDayOfYear(1);
        LocalDateTime localDateTime4 = localDateTime.plusDays(10);
        LocalDateTime localDateTime5 = localDateTime.minusYears(2);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("분 변경 = " + localDateTime1);
        System.out.println("시 변경 = " + localDateTime2);
        System.out.println("일 변경 = " + localDateTime3);
        System.out.println("일 변경 = " + localDateTime4);
        System.out.println("년 변경 = " + localDateTime5);

        System.out.println(localDateTime == localDateTime1);
        //주소값이 다름 하나씩 바뀌면 새로운 객체가 만들어지면서 반환이 됨
        //time은 불변

    }
}

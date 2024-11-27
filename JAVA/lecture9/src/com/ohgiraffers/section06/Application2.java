package com.ohgiraffers.section06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application2 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        System.out.println("초 : " + localTime.getSecond());
        System.out.println("분 : " + localTime.getMinute());
        System.out.println("시간 : " + localTime.getHour());
        System.out.println();

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("일년 중 몇 번째 일 : " + localDate.getDayOfYear());
        System.out.println("월 중 몇 번째 일 : " + localDate.getDayOfMonth());
        System.out.println("월(영어) : " + localDate.getMonth());
        System.out.println("월 : " + localDate.getMonthValue());
        System.out.println("년 : " + localDate.getYear());
        System.out.println("요일(영어) : " + localDate.getDayOfWeek());
        System.out.println();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("UTC와 시차 : " + zonedDateTime.getOffset());
        System.out.println("Zone 정보 : " + zonedDateTime.getZone());

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

    }
}

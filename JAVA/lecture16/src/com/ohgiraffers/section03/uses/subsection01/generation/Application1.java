package com.ohgiraffers.section03.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        //배열이나 컬렉션을 이용하여 스트림을 생성한는 방법
        //순회 -> 검색, 합산, 정렬 == 스트림을 써서 더 간단하게 만든다.

        //배열 스트림 생성
        String[] sarr = new String[] {"java" , "apple" , "orange"};
        //스트링타입의 스트림으로 반환한것
        Stream<String> strStream = Arrays.stream(sarr);
        //순회출력확인
        strStream.forEach(System.out::println);

        System.out.println("========범위가 정해져있는 스트림");

                                                            //end번째까지만 출력할거임
        Stream<String> strStream2 = Arrays.stream(sarr,0,2);
        strStream2.forEach(System.out::println);

        System.out.println("===========Collection");
        List<String> stringList = Arrays.asList("jadu","flog","css");
        //리스트안에 스트림이라는 메소드가 있어서 출력
        Stream<String> strStream3 = stringList.stream();
        strStream3.forEach(System.out::println);

        System.out.println("===========Bulider");
        Stream<String> buliderStream = Stream.<String>builder()
                //원하는 요소들을 추가한다음 이걸 스트림으로 만들어줘하는것임
                .add("홍길동")
                .add("유관순")
                .add("윤동길")
                .build();

        buliderStream.forEach(System.out::println);

        System.out.println("===========iterator()를 활용");
        //                                          첫번째를 10으로 시작해서 2를 곱하는것을 하고 그걸 10번까지 함
        Stream<Integer> intStream = Stream.iterate(10,value -> value * 2).limit(10);
        intStream.forEach(value -> System.out.print(value + " "));
    }
}

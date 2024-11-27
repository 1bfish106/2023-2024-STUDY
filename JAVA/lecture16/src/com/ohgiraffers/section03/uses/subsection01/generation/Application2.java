package com.ohgiraffers.section03.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        //기본타입스트림 생성

        //range는 시작값부터 1씩 증가하는 숫자를 종료값 전까지 스트림으로 생성
        //rangeClosed는 똑같은데 종료값까지 스트림으로 생성
        IntStream intStream = IntStream.range(5,10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5,10);
        longStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("====Wrapper클래스 자료형의 스트림으로 변환이 필요하면 Boxing하기====");
        //DoubleStream이랑 이건 다름 <<이건 기본자료형 이걸 박싱해서 스트림으로 변환한것
        //doubles(갯수) : 난수를 활용하여 DoubleStream을 전달한 개수만큼 생성하여 반환한다.
        //boxed() : 기본타입 스트림인 어쩌구Stream을 박싱하여 Wrapper타입의 Stream<어쩌구>로 반환한다.
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("====문자열을 IntStream으로 변환====");
        IntStream helloWorldChars = "hello world".chars();
        helloWorldChars.forEach(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("====문자열을 split하여 Stream으로 생성====");
        //regular expression 정규 표현식
        //str.spilt(",") 문자열을 띄어쓰기 해준다. 컴파일을 하고 반환되는건 스플릿
        //스플릿에 스플릿애즈스트림형태의 메소드가 있는것
        Stream<String> splitStream = Pattern.compile(",").splitAsStream("html,css,java");
        splitStream.forEach(System.out::println);

        System.out.println("====Stream.of()====");
        Stream<String> stringStream1 = Stream.of("orange","flog","tiger");
        Stream<String> stringStream2 = Stream.of("rabbit","insert","babo");

/*      stringStream1.forEach(System.out::println);
        //스트림은 1회성으로 사용이 가능하며 이미 열린 스트림은 재사용이 불가능하다
        //재사용하면 런타임에러 발생
        //stringStream2.forEach(System.out::println);
        stringStream2.forEach(System.out::println);*/

        System.out.println("========concat=========");
        Stream<String> concatStream = Stream.concat(stringStream1,stringStream2 );
        concatStream.forEach(v -> System.out.println(v + " "));
    }
}

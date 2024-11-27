package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.Book.book;

public class toString {

    public static void main(String[] args) {
        /* object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
        //16진수 해시코드는 인스턴스의 주소를 가리키는 값으로 인스턴스마다 모두 다르게 반환된다.
        book b1 = new book(1,"홍길동전","허균",50000);
        book b2 = new book( 2,"목민심서","정약용",50000 );
        book b3 = new book( 3, "삼국사기", "허균", 50000 );

        //오버라이드 되기전에는 여기 다 주소 나옴
        System.out.println(" b1.toString : " + b1.toString());
        System.out.println(" b2.toString : " + b2.toString());
        System.out.println(" b3.toString : " + b3.toString());

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

}

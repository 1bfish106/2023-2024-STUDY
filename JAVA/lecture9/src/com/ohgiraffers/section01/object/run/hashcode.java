package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.Book.book;

public class hashcode {
    public static void main(String[] args) {
        //이퀄스를 재정의하면 해쉬코드도 재정의
        //안하면 동등객체는 같은 해쉬코드를 가짐

        book b1 = new book(1,"홍길동전","허균",50000);
        book b2 = new book( 1,"홍길동전","허균",50000);

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}

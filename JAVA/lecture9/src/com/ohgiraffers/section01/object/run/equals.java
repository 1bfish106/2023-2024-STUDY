package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.Book.book;

public class equals {
    public static void main(String[] args) {
        //object클래스의 equals() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다.
        book b1 = new book(1,"홍길동전","허균",50000);
        book b2 = new book( 1,"홍길동전","허균",50000);

        //equals 메소드
        //매개변수로 전달받은 인스턴스와 == 연산하여 true or false로 반환 (동일인스턴스 인지 확인)
        //동일객체 : 주소가 동일한 인스턴스
        //동등객체 : 주소가 다르더라도 필드값이 같은거

        //오버라이딩하면 결과가 이퀄스 쓰면 true로 바뀜
        System.out.println("두 인스턴스 == 연산비교 : " + (b1 == b2));
        System.out.println("두 인스턴스 == 연산비교 : " + (b1.equals(b2)));

    }
}

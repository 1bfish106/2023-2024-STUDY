package com.ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {
        //문자열 객체 만드는법
        //리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.
        //new String("문자열") : 매번 새로운 인스턴스 생성

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        //1번과 2번은 주소는 같은 다른 객체
        //3번은 주소가 다른 객체 -- 힙에 자바가 생김
        //4번도 주소가 다른 객체 -- 힙에 또다른 자바가 생김
        //새로운 변수명으로 같은 문자를 써도 또 다른 객체를 생성함
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        //String 해쉬코드는 같은 클래스에 있으면 주소값은 똑같은 값으로 나온다
        System.out.println("str1.hashcode : " + str1.hashCode());
        System.out.println("str2.hashcode : " + str2.hashCode());
        System.out.println("str3.hashcode : " + str3.hashCode());
        System.out.println("str4.hashcode : " + str4.hashCode());

        //불변
        //기존문자열에 더하기 연산을 사용하는 경우 수정 아니고 새로운 문자열 할당
        //str2는 java를 생성한다음 oracle을 생성하고 주소값은 어차피 java를 생성했을당시랑 똑같다
        str2 += "oracle";
        System.out.println("str1 == str2 : " + (str1 == str2));
        //equals는 주소값이 아니고 그냥 값이 같은지만 물어보고있음
        //동일한 메소드인지 판단하기위해서 씀
        System.out.println("str1.equals(str3) : " + str1.equals(str3) );
        System.out.println("str1.equals(str4) : " + str1.equals(str4) );



    }
}

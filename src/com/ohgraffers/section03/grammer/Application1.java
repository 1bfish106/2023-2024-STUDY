package com.ohgraffers.section03.grammer;

public class Application1 {
    public static void main(String[] args) {
        //1. values(): 열거타입의 모든 값을 배열로 리턴
        for (enumType type : enumType.values()) {
            System.out.println(type);
        }

        //2. valueOf() 해당 이름을 가진 열거 타입 상수를 리턴
        for (enumType type : enumType.values()) {
            if(type == enumType.valueOf("JAVA"))
            System.out.println(type);
        }

        //3. ordinal() : 열거타입의 상수의 순서를 순회
        for(enumType type : enumType.values()){
            System.out.println(type.ordinal());
        }
        System.out.println(enumType.ORACLE.ordinal());

        //4. name() : 열거타입의 문자열을 리턴
        System.out.println(enumType.SPRING.name());
        //기본적으로는 toString()도 열거타입의 문자열을 리턴함, 필요에 따라 오버라이딩 해서 사용가능
        System.out.println(enumType.SPRING.toString());
        System.out.println(enumType.SPRING);
    }
}

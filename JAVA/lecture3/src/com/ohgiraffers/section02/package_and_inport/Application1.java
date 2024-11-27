package com.ohgiraffers.section02.package_and_inport;

import com.ohgiraffers.section01.method.Calculator;

public class Application1 {

    public static void main(String[] args) {
        /*패키지에 대해 이해할수있다.*/
        /*클래스명은 원래 패키지명을 포함하고 있다.*/
        /*다른 패키지에 존재하는 클래스를 사용하는 경우에는 클래스 앞에 패키지명을 명시해서 풀클래스명으로 사용해야한다.*/
        com.ohgiraffers.section01.method.Calculator calculator = new com.ohgiraffers.section01.method.Calculator();
    }

}

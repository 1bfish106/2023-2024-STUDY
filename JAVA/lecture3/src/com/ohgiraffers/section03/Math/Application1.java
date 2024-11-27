package com.ohgiraffers.section03.Math;

import java.sql.SQLOutput;

public class Application1 {
    public static void main(String[] args) {
        /*math 클래스에서 제공하는 static 메소드를 호출할수있다.*/

        /*Java.lang.math
        수학에서 자주 사용되는 상수들과 함수들을 미리 구현해 놓은 클래스로 모든 메소드는 static메소드로 작성되어있다.*/

        /*1. 절대값 출력*/
        /*풀 클래스 이름 작성*/
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

        /*import 해서 작성
        * java.lang 패키지 하위의 기능은 매우 자주 사용 되는 기능들이 있기 떄문에
        * 컴파일러가 자동으로 import.java.lang.*; 코드를 추가한다.
        * 따라서 별도의 import가 필요없다.*/
        System.out.println("-7의 절대값 : " + (Math.abs(-1.25)));

        /*2. 최대값,최소값 출력*/
        System.out.println("10과20중 더 작은 값? " + Math.min(10,20));
        System.out.println("10과20중 더 큰 값? " + Math.max(10,20));

        /*3. 원주율*/
        System.out.println("원주율 : "+ Math.PI);

        /*4. 난수 출력
        * 0부터 1미만의 실수 형태의 난수를 발생시킨다.
        * 호출시마다 다른 값을 가진다.*/
        System.out.println("난수 발생 : " + Math.random());

    }
}

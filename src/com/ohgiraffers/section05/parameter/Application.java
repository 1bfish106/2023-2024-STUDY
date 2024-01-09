package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        //메소드의 파라미터에 대해 이해하고 사용할수있다

        //매개변수 사용 가능한 자료형
        //1. 기본자료형
        //2. 기본 자료형 배열
        //3. 클래스 자료형
        //4. 클래스 자료형 배열
        //5. 가변 인자

        paraneterTest pt = new paraneterTest();

        int num = 20;
        pt.testPrimaryTypeParameter(num);

        //기본자료형은 "값을 전달" 하므로 메소드 내에서 변경 시켜도 main에서의 변수는 변화가 없다.
        System.out.println("main num : " + num);

        //2. 기본 자료형 배열
        int[] arr = {1,2,3,4,5};
        pt.testPrimaryTypeArrayParameter(arr);
        //배열은 주소값을 전달하므로 얕은 복사가 일어나 동일한 배열을 다루고 있다.
        //따라서 값의 변화가  그대로 출력이 된다
        System.out.println("main arr : " + Arrays.toString(arr));

        //3. 클래스 자료형
        Rectangle r = new Rectangle(12.5, 13.5);
        pt.testClassTypeParameter(r);

        //클래스 자료형은 "주소 값을 전달" 하므로 얕은 복사가 일어나 동일한 객체를 다루고있다.
        System.out.println("main의 넓이와 둘레");
        r.calcArea();
        r.calcRound();

        //4. 가변인자
        //인자로 전달하는 값의 갯수가 정해지지않은 경우 가변 인자를 활용할수있다.
      //  pt.testVariableLengthArraysParameter(); //name은 반드시 전달되어야함
        pt.testVariableLengthArraysParameter("정가연");
        pt.testVariableLengthArraysParameter("정가연", "볼링");
        pt.testVariableLengthArraysParameter("정가연", "볼링","축구","테니스");
        pt.testVariableLengthArraysParameter("정가연",new String[]{"볼링","축구","테니스"});



    }
}

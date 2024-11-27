package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class paraneterTest {



    public void testPrimaryTypeParameter(int num) {
        System.out.println("매개변수로 전달 받은 값 : " + num);
        num+=10;
        System.out.println("가공된 num : " + num);
    }


    public void testPrimaryTypeArrayParameter(int[] arr) {
        System.out.println("매개변수 배열로 전달 받은 값 : " + Arrays.toString(arr));
        arr[0] = 99;

    }

    public void testClassTypeParameter(Rectangle r) {
        System.out.println("매개변수로 전달 받은 넓이와 둘레");
        r.calcArea();
        r.calcRound();

        r.setWidth(100);
        r.setHeight(100);

        System.out.println("가공 된 넓이와 둘레");
        r.calcArea();
        r.calcRound();
    }
    public void testVariableLengthArraysParameter(String name, String...hobby) {
        //매개변수가 몇개 전달 될지 알 수 없으므로 반드시 매개변수 목록의 가장 뒤에 작성해야한다.
        //hobby에 몇개가 들어갈지 모르니깐 배열로 받아야한다.
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println("취미 : " + Arrays.toString(hobby));
    }

    // 가변인자를 사용하는 메소드는 오버로딩을 하지않는다 (오버로딩하면 모호해지기때문)
  //  public void testVariableLengthArraysParameter(String...hobby){}

}

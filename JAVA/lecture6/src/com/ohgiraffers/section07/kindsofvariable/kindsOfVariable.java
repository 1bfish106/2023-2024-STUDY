package com.ohgiraffers.section07.kindsofvariable;

public class kindsOfVariable {
    //다양한 변수를 이해하고 사용할 수 있다.

    //non-static field를 인스턴스 변수라고 한다 ( 인스턴스 생성 시점에 사용 가능한 변수)
    private int globalNum;
    //static field를 클래스 변수라고 한다. (정적 메모리 영역에 생성 되는 변수)
    private static int staticNum;

    public void method(int num){ //매개변수(일종의 지역변수)

        int lacalNum; // 지역변수는 반드시 초기화를 시켜야 출력이 가능하다

        System.out.println("num : " + num); //매개변수는 호출시 값이 전달되므로 별도의 초기화는 필요없다
    //    System.out.println("localnum : " + localNum); //지역변수 출력문구

        System.out.println("globalNum : " + globalNum);
        System.out.println("staticNum : " + staticNum);
    }

    public void method2(){
        //지역변수는 해당지역(블럭내)에서만 사용이 가능하며
        //전역 변수는 클래스 내의 모든 영역에서 사용할 수 있다.
    //    System.out.println("localnum : " + localNum);
        System.out.println("globalNum : " + globalNum);
        System.out.println("staticNum : " + staticNum);
    }

}

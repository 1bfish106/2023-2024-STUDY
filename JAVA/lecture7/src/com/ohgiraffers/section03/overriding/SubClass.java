package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

    //메소드이름 리턴 타입 매개변수 갯수&타입&순서 일치해야 성립
 @Override
  //  public void method2(int num){}
  //  public int method (int num) {return 0;}
  //  public void method(String num){}
    public void method(int num){ }

    //private은 오버라이드 불가능
    //@Override
    //private void privateMethod(){}

    //final 메소드 오버라이딩 불가
    //@Override
    //public final void finalMethod(){}


    //protected - > default로 변경시 더 좁은 범위로의 변경이라 안됨
    //@Override
    //void protectedMethod(){}

    //protected - > public 더 넓은 범위로 변경가능
    @Override
    public void protectedMethod(){}



}

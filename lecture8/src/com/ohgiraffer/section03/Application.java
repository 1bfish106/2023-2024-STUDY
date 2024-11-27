package com.ohgiraffer.section03;

import com.ohgiraffer.section03.interfaceimplements.InterProduct;
import com.ohgiraffer.section03.interfaceimplements.Product;

public class Application {
    public static void main(String[] args) {

        InterProduct interProduct = new Product();

        //오버라이딩이 강제화 된 추상 메소드
        interProduct.nonStaticMethod();
        interProduct.absMethod();
        //오버라이딩인데 강제화가 안된 default 메소드
        interProduct.defualtMethod();
        //인터페이스에 정의된 static 메소드
        //얘는 인터프로덕트에만 있는거라 InterProduct. 이다.....
        InterProduct.staticMethod();
        /* 인터페이스에 정의 된 상수 필드 */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

        //인터페이스 사용 이유?
        //1. 추상 클래스와 유사하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용한다. (표준화)
        //2. 자바의 단일 상속의 장점을 극복할수있다. (다중상속)
    }
}

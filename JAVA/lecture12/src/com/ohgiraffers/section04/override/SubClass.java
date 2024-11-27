package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    //throws 구문없이 오버라이딩을 할수있다.
   // @Override
   // public void method() {}

    //똑같이 써도 문제없음
   // @Override
    // public void method() throws IOException {}

    //상위클래스와 하위클래스는 같이 쓸수없다.
    //부모 예외 처리클래스보다 상위 예외로는 후손클래스에서 오버라이딩 할수없다.
   // @Override
   // public void method() throws Exception {}

    //부모 예외 처리 클래스보다 하위의 예외(더 구체적인 예외)인 경우에는 오버라이딩 할수있다.
    @Override
    public void method() throws FileNotFoundException {}

}

package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegative;
import com.ohgiraffers.section02.userexception.exception.notEnoughMoney;
import com.ohgiraffers.section02.userexception.exception.priceNegative;

public class Application3 {
    public static void main(String[] args) {
        //멀티캐치블럭으로 동일한 레벨의 다른 타입의 예외를 하나의 캐치블럭으로 처리

        exceptiontest et = new exceptiontest();

        try {
            et.checkEnoughMoney(2000,-1000);
            //같은 레벨을 하는것은 상관없음
            //상위타입이랑 하위타입은 같이 나열하면 안된다.
        } catch (priceNegative | MoneyNegative e) {
            //현재 e가 어떤 클래스를 가지고있는지 확인해보면서 출력
            System.out.println(e.getClass() + "발생!"); //getClass에서 발생한 예외 클래스의 이름을 알수있음
            System.out.println(e.getMessage());
        }  catch (notEnoughMoney e) {
            System.out.println("notEnoughMoney 발생!");
            System.out.println(e.getMessage());

        }
    }
}

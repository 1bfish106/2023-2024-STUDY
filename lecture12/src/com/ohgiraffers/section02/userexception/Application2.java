package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegative;
import com.ohgiraffers.section02.userexception.exception.notEnoughMoney;
import com.ohgiraffers.section02.userexception.exception.priceNegative;

public class Application2 {
    public static void main(String[] args) {

        //다양한 타입의 예외를 multi catch block을 이용해서 처리할수있다.
        exceptiontest et = new exceptiontest();

        try {
            et.checkEnoughMoney(3000,5000);

            //예외 상황별로 catch블럭을 따로 작성해서 처리
        }//catch(Exception e){}
        //멀티블럭은 위에서부터 아래로 진행하면서 자신의 예외 타입과 맞는경우 동작
        //상위 타입이 먼저 서술되면 하단의 캐치블럭으로는 절대 도달 못함
        //따라서 캐치블럭의 서술순서는 하위타입 -> 상위타입으로 서술
        catch(priceNegative e) {
            System.out.println("priceNegative 발생");
            System.out.println(e.getMessage());
        } catch (MoneyNegative e) {
            System.out.println("MoneyNegative 발생");
            System.out.println(e.getMessage());
        } catch (notEnoughMoney e) {
            System.out.println("notEnoughMoney 발생");
            System.out.println(e.getMessage());
        }finally {
            //예외 발생 여부의 상관없이 실행
            System.out.println("finally 블럭의 내용이 동작함");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}

package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegative;
import com.ohgiraffers.section02.userexception.exception.notEnoughMoney;
import com.ohgiraffers.section02.userexception.exception.priceNegative;

public class exceptiontest {

    public void checkEnoughMoney(int price, int money) throws priceNegative, MoneyNegative, notEnoughMoney {
        //쓰루 구문 작성시 익셉션을 나열할 수 있으며 상위 타입의 익셉션만 작성가능
        //throws Exception {
        if(price < 0){
        //예외발생
            throw new priceNegative("상품 가격은 음수일 수 없습니다.");
        }

        if(money < 0){
            throw new MoneyNegative("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if (money < price){
            throw new notEnoughMoney("가진돈보다 상품가격이 더 비쌉니다.");
        }
        System.out.println("가진돈이 충분합니다 즐거운 쇼핑 되세요");
    }
}

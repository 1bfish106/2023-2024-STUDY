package com.greedy.level01.basic;

public class Calculaor {
    public void checkMethod(){
     System.out.println("메소드 호출 확인");
    }

    public int allSumNumbers(int inum1, int inum2, int inum3, int inum4, int inum5, int inum6, int inum7, int inum8, int inum9, int inum10){
        return inum1+inum2+inum3+inum4+inum5+inum6+inum7+inum8+inum9+inum10;
    }

    public int  checkMaxNumber(int first, int second){

        return first > second ? first : second;

    }

    public int  sumTwoNumber(int first, int second){
        return first + second;
    }

    public int minusTwoNumber(int first1, int second2) {
        return first1 - second2;
    }
}

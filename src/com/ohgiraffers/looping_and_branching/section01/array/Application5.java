package com.ohgiraffers.looping_and_branching.section01.array;

public class Application5 {

    public static void main(String[] args) {
        /*랜덤한 카드 한장 뽑아서 출력해보기*/

        /*배열과 동시에 초기화 시킴*/
        String[] shapes = {"SPADE", "CLOVER" , "HEART", "DIAMOND"};
        String[] cardNumbers = {"2" , "3", "4", "5", "6", "7", "8", "9", "10","JACK","KING","ACE"};

        /*랜덤한 카드 골라주기*/
        int randomShape = (int)(Math.random() * shapes.length);
        int randomCardNumber = (int)(Math.random() * cardNumbers.length);

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShape] + " " + cardNumbers[randomCardNumber] + " 카드 입니다.");

    }
}

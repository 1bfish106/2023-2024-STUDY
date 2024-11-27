package com.ohgiraffers.section01.Switch;

import java.util.Scanner;

public class switch1 {

    public void testSimpleSwitchStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 : ");
        int first = sc.nextInt();
        System.out.println("두번째 정수 : ");
        int second = sc.nextInt();
        System.out.println("연산기호 입력 (+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        /*연산의 결과를 저장할 변수*/
        int result = 0;

        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                /* second(나누는 수)가 0이면 java.lang.ArithmeticException: / by zero 이 발생한다  */
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
        }

        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void testSwitchVendingMachine() {
        /* switch문 내에 break문에 대한 흐름을 이해하고 적용할수있다. */

        /* switch문을 이용한 간단한 자판기 */
        System.out.println("=== vending machine ===");
        System.out.println(" 사이다 콜라 환타 바카스 핫식스 ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");

        /* 원하는 음료를 문자열로 입력받음 */
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        /* 원하는 음료에 맞는 가격을 저장할 변수 */
        int price = 0;

        /* 하지만 한 개의 메뉴를 선택해도 그 메뉴 이후의 메뉴가 전부 선택이 되는 이상한 자판기가 되었다.
         * 가격 또한 음료별로 다르지만 마지막 메뉴 가격인 10000원으로 고정되어 있다.
         * */
        switch (selectedDrink) {
            case "사이다":
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
            case "콜라":
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
            case "환타":
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
            case "바카스":
                System.out.println("바카스를 선택하셨습니다.");
                price = 2000;
            case "핫식스":
                System.out.println("핫식스를 선택하셨습니다.");
                price = 10000;
        }

        }
    public void testSwitchVendingMachine2(){
        System.out.println("------------------ 개선된 자판기 --------------------");
        System.out.println("=== OhGiraffers vending machine ===");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");

        /* 원하는 음료를 문자열로 입력받음 */
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        /* 원하는 음료에 맞는 가격을 저장할 변수 */
        int price = 0;

        String order = "";
        switch (selectedDrink) {
            case "사이다":
                order = "사이다";
                price = 500;
                break;
            case "콜라":
                order = "콜라";
                price = 600;
                break;
            case "환타":
                order = "환타";
                price = 700;
                break;
            case "바카스":
                order = "바카스";
                price = 2000;
                break;
            case "핫식스":
                order = "핫식스";
                price = 10000;
                break;
            default:
                order = "없는 음료";
        }
        System.out.println(order + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요!");


    }
}

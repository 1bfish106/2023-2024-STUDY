package com.ohgiraffers.section03.breanching;

import com.ohgiraffers.section02.B_while;

public class Application1 {
    public static void main(String[] args) {

        A_break a1 = new A_break();
        //a1.testSimpleBreakStatement();
        //a1.testSimpleBreakStatement2();
        //a1.testJumpBreak();

        B_continue b1 = new B_continue();
        //b1.testSimpleContinueStatement();
        //b1.testSimpleContinueStatement2();
        b1.testSimpleContinueStatement3();
    }
}

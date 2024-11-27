package com.ohgiraffers.section02;

public class Application {
    public static void main(String[] args) {
       // A_for a = new A_for();
       // a.testSimpleForStatement();

        A_for a = new A_for();
        //a.testForExample2();
       // a.testForExample3();
        //a.testForExample4();
        //a.printSimpleGugudan();

        A_nestedFor a2 = new A_nestedFor();
        //a2.printGugudanFromTwoToNine();
        //a2.printStarInputRowTimes();
       //a2.printTriangleStars();

        B_while b1 = new B_while();
        //b1.testSimpleWhileStatement();
        //b1.testWhileExample();
        //b1.testWhlieGugudan();

        C_doWhlie c1 = new C_doWhlie();
        //c1.testSimpleDoWhileStatement();
        c1.testDoWhileExample();
    }
}

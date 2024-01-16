package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        //Stack - 리스트는 백터가 구현 - 백터는 스택을 상속한다
        //백터는 동기화처리가 되고 성능적으로 느리다 그래서 지금은 잘안씀
        //<>여기에 만든 데이터를 쌓고 꺼낼거임요 근데 꺼내질때는 가장 나중에 쌓인것부터 꺼내짐
        Stack<Integer> integerStack = new Stack<>();

        //stack에 값을 넣을땐 push()
        //add()도 가능하지만 백터메소드니깐 push()써라
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        //스택에서 요소찾을땐 search()
        //위에서부터 순번 가장 상단위치는 1부터 시작
        //다섯번째 인티져 값을 찾아라 -- 1
        //첫번째 값을 찾아라 -- 5
        System.out.println(integerStack.search(5));

        //스택에서 데이터 꺼내기는 두가지 메소드가있음
        //peak() : 가장 상단에 있는거 반환
        //pop() : 가장 상단에 있는 요소를 반환후 제거

        System.out.println("peak : " + integerStack.peek());
        System.out.println(integerStack); //그냥 상단에 있는거 보여줌

        System.out.println("pop : " + integerStack.pop());
        System.out.println(integerStack); // 가장 상단에 있는거 꺼내서 제거함

        System.out.println("pop : " + integerStack.pop());
        System.out.println("pop : " + integerStack.pop());
        System.out.println("pop : " + integerStack.pop());
        System.out.println("pop : " + integerStack.pop());
        System.out.println("pop : " + integerStack.pop());

        //꺼내면서 요소가 제거되기때문에 계속 실행하면 java.util.EmptyStackException 생김
    }
}

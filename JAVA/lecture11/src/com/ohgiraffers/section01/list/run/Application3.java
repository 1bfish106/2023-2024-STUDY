package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        //LinkedList

        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("grape");
        linkedList.add("orange");
        linkedList.add("mango");
        System.out.println("linkedList : ");
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }

        linkedList.remove(1);
        //  자료형 자료변수명  반복할거
        System.out.println("linkedList remove : ");
        for(String str : linkedList){
            System.out.println(str);
        }

        linkedList.set(0,"peach");
        System.out.println(linkedList);

        System.out.println(linkedList.isEmpty());
        linkedList.clear();
        System.out.println(linkedList.isEmpty());

        //LinkedList는 List인터페이스를 상속받아서 ArrayList랑 사용방법 똑같
        //요소 저장 방법 차이 있음
        //조회 > 수정 - ArrayList, 수정 > 조회 = LinkedList


    }
}

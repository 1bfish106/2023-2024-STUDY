package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        //Queue
        //데이터를 쌓고 가장 먼저 쌓인애가 반환된다

        //Queue<String> que = new Queue();
        //큐는 인터페이스를 상속받기 떄문에 인스턴스 생성불가

        //LinkedList 타입을 활용해서 큐를 만듦
        Queue<String> que = new LinkedList<>();

        //큐에 데이터를 추가하려면 offer()
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        //데이터를 꺼내려면 peak(),poll()
        //peak() : 맨 앞에 있는 요소 반환 얘는 꺼내지고 남는데
        //poll() : 맨앞에 있는 요소 반환 후 제거 얘는 꺼내지고 지워짐

        System.out.println(que.peek());
        System.out.println(que);

        System.out.println(que.poll());
        System.out.println(que);
        //계속 꺼내고 지워보기
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        //큐에서 반환값이 없을경우 null이 반환된다.










    }
}

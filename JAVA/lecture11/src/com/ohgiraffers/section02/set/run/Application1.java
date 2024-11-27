package com.ohgiraffers.section02.set.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        //HashSet
        HashSet<String> hashSet = new HashSet<>();
        //다형성을 이용해서 상위타입으로 선언
        Set<String> hashset2 = new HashSet<>();
        Collection<String> hashset3 = new HashSet<>();

        //set 계열 데이터 추가시 add
        //얘가 해쉬연산을 해서 우리는 안보여주고 지만 알고 데이터값을 순서없이 보여줌
        hashSet.add(new String("java"));
        hashSet.add(new String("mysql"));
        hashSet.add(new String("jdbc"));
        hashSet.add(new String("html"));
        hashSet.add(new String("css"));

        System.out.println(hashSet);

        //중복값이 저장 안됨
        //동일객체 (주소값 일치)뿐 아니라 동등객체 (필드값 일치)도 중복 값으로 판단되어 처리
        //String에는 equals()와 Hashcode()가 오버라이딩 되어있기 때문이다.
        hashSet.add(new String("java"));
        System.out.println(hashSet);
        //contains() 메소드는 해당 객체를 포함하고 있는지 확인하는 메소드로 여기서도 동등객체로 판단한다.
        //내부적으로 equals()메소드 호출
        System.out.println(hashSet.contains(new String("html")));

        //저장된 객체를 인덱스 기준으로 순회할수 없다.
        //반복문을 이용한 연속처리 방법
        //1. toArray() 메소드로 배열로 변경한뒤 for 사용
        //2. iterator() 메소드로 반복자를 만들어서 연속처리

        Object[] arr = hashSet.toArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        Iterator<String> iter = hashSet.iterator();

        //컬렉션의 상위타입인 이더레이블 인터페이스에 iterator()메소드가 정의되어있음
        //컬렉션 타입이라면 반복자를 통한 순회를 할수있음.
        //반복문을 돌리라고 하고 다음값을 반환하라고 하는것
        while(iter.hasNext()){
            System.out.println(iter.next());
        }







    }
}

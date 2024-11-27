package com.ohgiraffers.section01.list.Comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

    //comparator 사용시 제네릭 선언을 함께 해줘야 compare 메소드의 매개변수 타입이 정의된다.
    //object타입인 경우 다운캐스팅 해서 사용해야 하므로 제네릭 타입을 결정해주고 사용하는것이 좋다.

public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        //비교 대상 두 인스턴스의 가격이 오름차순 정렬이 되기 위해서는 앞의 가격이 더 작은가격이어야한다.
        //만약에 반대면 순서를 바꿔야하는데 바꾸는 신호로 양수를 반환하면 정렬시 순서를 바꾸는 조건으로 사용된다.

        int result = 0;

        if(o1.getPrice() > o2.getPrice()){
            result = 1;
        }else if (o1.getPrice() < o2.getPrice()){
            result = -1;
        }else{
            result = 0;
        }

        return result;
    }

    //sort() 메소드에서 내부적으로 compare 메소드를 호출하여 swap 여부를 결정한다.
    //Comparator 인터페이스를 상속받으면 compare메소드 오버라이딩이 강제화된다.
    //오브젝트는 아무객체나 다 넘어올수있기때문에





}

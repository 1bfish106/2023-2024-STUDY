package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.dto.BookDTO;
import com.ohgiraffers.section01.list.Comparator.AscendingPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        //ArrayList 사용자 정의 자료형으로 이용, 정렬하기

        //여러권의 책 목록을 관리할 ArrayList 생성
        List<BookDTO>booklist = new ArrayList<>();

        booklist.add(new BookDTO(1, "홍길동전", "허균" , 50000));
        booklist.add(new BookDTO(2, "목민심서", "정약용" , 40000));
        booklist.add(new BookDTO(3, "동의보감", "허준" , 70000));
        booklist.add(new BookDTO(4, "삼국사기", "김부식" , 60000));
        booklist.add(new BookDTO(5, "삼국유사", "일연" , 80000));

        //향상된 for문을 이용해서 booklist 순회 출력
        //오른쪽에는 반복하고자 하는 대상의 이름 왼쪽은 이용할 객체의 이름
        for(BookDTO book: booklist){
            System.out.println(book);
        }

        //정렬하는 기준이 없기 때문에 안된다.
        //스트링은 컴퍼러블을 상속하고있었기 때문에 sort가 가능
        //하지만 BookDTO는 컴퍼러블에 상속되지않고 정렬기준도 없음
        //Collections.sort(booklist);

        //가격 오름차순 정렬
        //AscendingPrice 클래스 생성 (Comparator 인터페이스를 구현하여 정렬기준을 작성)
        Collections.sort(booklist,new AscendingPrice());
        System.out.println("가격 오름차순");
        for(BookDTO book : booklist){
            System.out.println(book);
        }

        //가격 내림차순 정렬
        //위에 했던것처럼 해도 되지만 한번 만 사용하기 위해서는 더 간편하게 익명 클래스(Anonymous class)를 사용할수있다.
        //new부터 익명 클래스가 생성
        //이름이 없음 지금 이순간 단한번만 사용하고 안씀 다시 이 객체를 못만듦
        Collections.sort(booklist, new Comparator<BookDTO>() {
            @Override
            //o1이 더 크면 음수를 반환하라
            public int compare(BookDTO o1, BookDTO o2) {
                //o2의 가격이 더 큰 경우에 양수를 반환하여 swap하라는 flag를 전달한다.
                //return o1.getPrice() >= o2.getPrice() ? -1 : 1;
                return o2.getPrice() - o1.getPrice();
            }
        });
        for(BookDTO book : booklist){
            System.out.println(book);
        }

        //제목 오름차순 정렬
        booklist.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                //문자열 대소비교는 String 클래스에 정의된 compareTo() 메소드를 활용
                //앞이 작은경우 음수 같으면 0 더 크면 양수
               return o1.getTitle().compareTo(o2.getTitle());

            }

        });
        System.out.println("제목 오름차순");
        for(BookDTO book : booklist){
            System.out.println(book);
        }


        booklist.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                //문자열 대소비교는 String 클래스에 정의된 compareTo() 메소드를 활용
                //앞이 작은경우 음수 같으면 0 더 크면 양수
                return o2.getTitle().compareTo(o1.getTitle());

            }

        });
        System.out.println("제목 내림차순");
        for(BookDTO book : booklist){
            System.out.println(book);
        }


    }
}

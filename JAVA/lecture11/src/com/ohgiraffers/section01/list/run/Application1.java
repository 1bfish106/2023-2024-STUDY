package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        //Arraylist
        //배열의 단점을 보완
        //배열은 크기변경 불가능 요소추가 삭제 정렬 복잡
        // 여기서는 메소드로 미리 구현해서 제공
        //요소 = element
        //내부적으로 수행될뿐 실행속도는 안빨라짐

        //ArrayList는 생성하면 내부적으로 10칸짜리 배열을 생성해서 관리
        ArrayList alist = new ArrayList();

        //다형성 활용 상위 레퍼런스로 Arraylist객체를 참조
        //구체적이지 않게 (=더 간단하게) 쓰는것이 낫다
        //ArrayList의 상위 인터페이스가 List이기 때문에 가능
        List list = new ArrayList();

        //List의 상위도 가능 List의 상위는 Collection
        Collection clist = new ArrayList();

        //add 메소드를 통해 저장
        //현재는 object클래스의 하위 타입 인스턴스 모두 가능
        alist.add("apple");
        alist.add(123);
        alist.add(45.67);
        alist.add(new java.util.Date());

        //인덱스가 부여되어 순번이 적용된다.
        //toString 메소드가 오버라딩 되어서 담겨있는 요소들을 확인할수있다.
        System.out.println("alist : " + alist);
        //현재 저장되어있는 데이터의 길이
        //내부적으로 관리되는 배열의 사이즈는 외부에서 알필요가 없으므로 기능으로 제공되지않음
        System.out.println("alist 의 size : " + alist.size());

        //내부 배열에 인덱스가 지정되어있기 때문에 for문 가능
        for(int i = 0; i < alist.size(); i++){
            //인덱스 값을 가져올땐 get으로 가져옴
            //실제 담겨있는 인덱스들을 반환받고 싶으면 for문 활용

            System.out.println(i + " " + alist.get(i));
        }

        //저장될때 순서대로 저장 그래서 중복저장이 가능하다.
        alist.add("apple");
        System.out.println("alist : " + alist);

        //원하는 인덱스 위치에 값을 추가
        //1번 인덱스 위치에 바나나를 저장하고싶음
        //index 위치에 element를 넣음 그래서 하나씩 뒤로 밀리는 결과값을 얻는다
        alist.add(1, "banana");
        System.out.println("alist : " + alist);

        //저장된 값을 삭제할때는 remove() 메소드를 사용한다.
        //삭제하면 인덱스를 한칸씩 당겨온다.
        //인덱스 위치의 값이 삭제되고 뒤에 것들이 당겨져왔다.
        alist.remove(2);
        System.out.println(alist);

        //저장한 값을 수정할때는 set() 메소드를 사용한다.
        //인덱스위치에 다른값으로 바꾼다.
        alist.set(1,true);
        System.out.println(alist);

        //모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성
        List<String>stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("grape");
        stringList.add("orange");
        stringList.add("mango");
        //제네릭 타입을 지정하면 지정한 타입외의 인스턴스는 안됨
        //stringList.add(123);

        System.out.println(stringList);

        //저장 순서를 유지하고 있는 stringList를 오름차순으로 정렬
        //Collection 인터페이스가 아닌 Collections 클래스를 사용한다.
        //컬렉션에서 사용 되는 기능들을 static 메소드들로 구현한 클래스이다.
        //sort메소드를 사용하면 오름차순으로 정렬된다.
        Collections.sort(stringList);
        //유니코드순대로 정렬된다.
        System.out.println(stringList);

    }
}

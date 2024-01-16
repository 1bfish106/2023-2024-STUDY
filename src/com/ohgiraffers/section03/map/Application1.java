package com.ohgiraffers.section03.map;

import java.sql.SQLOutput;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        //Map(key,value)
        //HashMap

        HashMap hmap = new HashMap();
        //검색적인 측면에서 뛰어남

        //키와 값을 같이 저장해야됨
        //키와 값은 반드시 객체여야함
        hmap.put("one",new Date());
        //첫번째는 키에 해당하는 값 두번째는 값에 해당하는거
        hmap.put("one",new Date());
        hmap.put(12,"purple apple");
        hmap.put(33,123);
        //전부 오토박싱 되어서 인티저로 저장된다.

        System.out.println(hmap);
        //키값이 똑같을때 값을 중복저장하지않기 때문에
        //벨루값이 덮어쓰기가 일어난다
        hmap.put(12,"green banana");
        System.out.println(hmap);

        //벨루값이 똑같으면 값이 한번더 저장이 된다.
        hmap.put(9,"green banana");
        System.out.println(hmap);

        //값을 꺼낼때
        //List.get(index) 였고
        //map.get(key) 임
        System.out.println("키 9에 대한 객체 : " + hmap.get(9));

        //값을 삭제할때
        hmap.remove(9);
        System.out.println("키 9에 대한 객체 : " + hmap);

        //key값은 String타입을 많이 씀
        //문자열 키와 문자열 값을 가지는 hashmap
        HashMap<String , String> hmap2 = new HashMap<>();
        //일반적으로 제네릭 선언후에 생성
        hmap2.put("one" , "orange");
        hmap2.put("two" , "apple");
        hmap2.put("three" , "grape");
        hmap2.put("four" , "purple");
        hmap2.put("five" , "wow");

        //1. keyset을 활용해서 key만 set으로 만들고 iterator로 키에 대한 목록 만들기
        Iterator<String> keyIter = hmap2.keySet().iterator();

        while (keyIter.hasNext()){ //키이덜값 다음에 뭐가오나요
            String key = keyIter.next(); // 다음에 옴
            String value = hmap2.get(key); // 키값을 불러와라
            System.out.println(key+value);
        }

        //1-2 향상된 포문을 활용
        System.out.println("=========1-2");
        //키값이랑          여기는 벨루값
        for(String key : hmap2.keySet()){
            System.out.println(key + "=" + hmap2.get(key));
        }

        //2. 저장된 밸루객체들만 values()로 Collection으로 만든다.
        //이더레이터로 값에 대한 목록을 만듦
        System.out.println("==========2");
        Collection<String> values = hmap2.values();
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println(valueIter.next());
        }
        //벨루의 목록만 만듦
        System.out.println("==========2-1");
        for(String value : hmap2.values()){
            System.out.println(value);
        }

        //3. Map의 내부에 EntrySet 이용 : EntrySet()
        //엔트리는 키랑 벨루가 묶여있는형태
        //제네릭이 두번 곂쳐서 사용되고있음
        System.out.println("=========3");
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        Iterator<Map.Entry<String,String>> entryIter = set.iterator();
        //맵은 순회용도로 별로 안씀
        //그래서 set의 형태로 만들어서 씀
        //리스트는 순회를 함 대부분
        //맵 ->셋 -> 이더레이터
        while(entryIter.hasNext()){
            Map.Entry<String,String> entry = entryIter.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        //3-1 향상된 포문 활용하기
        System.out.println("==========3-1");
        for(Map.Entry<String, String> enter : hmap2.entrySet()){
            System.out.println(enter.getKey() + enter.getValue());
        }






    }
}

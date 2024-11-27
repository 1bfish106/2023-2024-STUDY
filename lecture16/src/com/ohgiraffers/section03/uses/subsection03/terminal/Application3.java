package com.ohgiraffers.section03.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        System.out.println("=====collect=====");
        //collect() 메소드는 Collectors에서 제공하는 정적 메소드를 사용할수있으며,
        //컬렉션을 출력으로 받을수있다.

        List<Member> memberList = Arrays.asList(
                new Member("test01", "우별림"),
                new Member("test02", "오나윤"),
                new Member("test03", "정가연")
        );

        List<String> memberNameList = memberList.stream()
             /*   .map(member -> member.getMemberName())*/
                .map(Member::getMemberId)
                //스트림이었던 애를 컬렉션 형태로 만들어준다.
                .collect(Collectors.toList());
        System.out.println("memberNameList : " + memberNameList);

        String str = memberList
                .stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining());
        System.out.println(str);


        String str2 = memberList
                .stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining("||","**","**"));
        System.out.println(str2);
    }
}

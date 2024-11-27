package com.ohgiraffers.section02.superKeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        //super와 super()에 대해 이야기할수있다.

        //product기본 생성자
        Product product1 = new Product();
        System.out.println(product1.getInformation());
        Product product2 = new Product("S-01234", "삼성", "갤럭시폴드2", 2389000, new Date());
        System.out.println(product2.getInformation());

        //Computer 기본생성자
        Computer computer1 = new Computer("스냅드래곤", 512, 12, "안드로이드" );
        System.out.println(computer1.getInformation());

        Computer computer2 = new Computer("스냅드래곤", 512, 12, "안드로이드" );
        System.out.println(computer2.getInformation());

        Computer computer3 = new Computer("스냅드래곤", 512, 12, "안드로이드" );
        System.out.println(computer3.getInformation());
    }
}

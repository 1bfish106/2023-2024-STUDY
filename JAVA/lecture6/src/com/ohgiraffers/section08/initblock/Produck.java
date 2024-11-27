package com.ohgiraffers.section08.initblock;

public class Produck {

    //1. 필드를 초기화 하지 않으면 jvm이 지정한 기본 값으로 초기화 되며 객체가 생성된다
  // private String name;
   // private int price;
  //  private static String brand;

    //2. 명시적 초기화
    private String name ="갤럭시";
    private int price = 100000;
    private static String brand = "삼성";

    //3. 초기화 블럭
    //인스턴스 초기화 블럭
    { //객체를 만들어주었을때 동작
        name = "사이먼";
        price = 800000;
        //static초기화 블럭에서 이미 삼성으로 초기화 되어있지만
        //인스턴스 생성시 다시 인스턴스 초기화 블럭이 동작하며 사과로 변경된다.
        brand = "사과";

        System.out.println("인스턴스 초기화 블럭 작동함...");
    }
    //static 초기화 블럭
    static{ //프로그램 시작할때만 동작

        brand = "삼성";
        //static 초기화 블럭에서는 논스태틱 필드를 초기화 할 수 없다.
        //정작 초기화 블럭 동작시에는 인스턴스가 존재하지 않기 때문이다.
       // name = "아이폰";
       // price = 1500000;

        System.out.println("static 초기화 블럭 동작함...");

    }


    public Produck(){
        System.out.println("기본생성자 동작함...");
    }

    public Produck(String name, int price, String brand){
        this.name = name;
        this.price = price;
        Produck.brand = brand;
        System.out.println("매개변수 생성자 동작함...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void setBrand(String brand) {
        Produck.brand = brand;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static String getBrand() {
        return brand;
    }
    public String getInfomation(){
        return this.name + this.price + this.brand;
    }
}

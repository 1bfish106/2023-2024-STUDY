package com.ohgiraffers.section02.superKeyword;

import java.util.Date;

public class Product {

    private String code; //코드
    private String brand; //브랜드
    private String name; //이름
    private int price; //가격
    private Date manufacturingDate; //제조일자

    //기본생성자
    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출");
    }

    //모든 필드를 초기화하는 매개변수 생성자
    public Product(String code, String brand, String name, int price, Date manufaturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufaturingDate;
    }
    //setter getter 메소드

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInformation() {
        return code + brand + name + price + manufacturingDate;
    }
}
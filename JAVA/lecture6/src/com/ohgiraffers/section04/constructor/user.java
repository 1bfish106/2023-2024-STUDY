package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class user {

    //필드부
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    //생성자 작성 위치
    //문법상 클래스 내부에 작성하면 되지만 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는것이 관례이다.
    // 생성자 사용목적
    //1. 인스턴스 생성 시점에 수행할 명령이 있는 경우
    //2. 매개변수가 있는 생성자의 경우 매개 변수로 전달받은 값으로 필드를 초기화하여 인스턴스를 생성할 목적으로 주로 사용
    //3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지않는다는 의미
    // 따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용가능 (초기값 전달 강제화)

    //1. 기본생성자 (default constructor)
    //클래스 내에 작성 된 생성자가 0개일 경우 컴파일러가 자동으로 기본생성자를 생성한다.
    public user(){
        //인스턴스 생성 시점에 수행할 명령이 있는 경우 작성할수 있다.
        System.out.println("user 클래스의 기본 생성자 호출함...");
    }
    //2. 매개변수 생성자
    //초기화 할 필드가 여러개인 경우, 초기화 하고 싶은 필드의 조합 별로 생성자를 여러개 작성할수있다.
    public user(String id, String pwd, String name){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("user 클래스의 id,pwd,name을 초기화하는 생성자 호출함...");
    }

    public user(String id, String pwd, String name, Date enrollDate){
    //    this.id = id;
    //    this.pwd = pwd;
    //    this.name = name;
        //this()는 동일한 클래스내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
        //괄호안의 매개변수의 타입,갯수,순서에 맞는 생성자를 호출하고 복귀한다. (메소드와 동일)
        //리턴되어 돌아오지만 리턴값은 존재하지 않으며 가장 첫줄에 선언해야한다.
        this(id, pwd, name); //반드시 첫번째 줄에 작성해야된다
        this.enrollDate = enrollDate;
        System.out.println("user 클래스의 id,pwd,name,enrollDate를 초기화하는 생성자 호출함...");
    }

    //메소드부
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getInformation(){
        return "User[id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }
}

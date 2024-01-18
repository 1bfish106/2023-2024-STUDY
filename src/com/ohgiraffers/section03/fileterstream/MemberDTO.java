package com.ohgiraffers.section03.fileterstream;

import java.io.Serializable;

public class MemberDTO implements Serializable {

    //객체 입출력을 위해서는 직렬화처리
    //직렬화 대상 클래스에 Serializable 인터페이스만 구현하면 됨
    //이 클래스는 시리얼라이제이블 인터페이스를 구현합니다.
    private String id;
    private String pw;
    private String name;
    private String email;
    private int age;
    private char gender;

    //transient 예약어는 특정 필드를 직렬화에서 제외한다는 말이다.
    private transient double point;

    public MemberDTO() {
    }

    public MemberDTO(String id, String pw, String name, String email, int age, char gender, double point) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }
}

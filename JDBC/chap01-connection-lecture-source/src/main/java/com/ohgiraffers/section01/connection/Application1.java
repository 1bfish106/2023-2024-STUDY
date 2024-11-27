package com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application1 {
    public static void main(String[] args) {
        Connection con = null;

        try {
            /* 사용할 드라이버 등록
         * 입력한 클래스명이 올바르지 않을 경우 무제가 생기므로 ClassNotFoundException 핸들링*/
            Class.forName("com.mysql.cj.jdbc.Driver");

            /*DriverManager를 사용해서 Connection 생성
            * 접속 url, 계정 정보를 절달하여 Connection 객체를 만들어서 반환받는다
            * 접속 정보가 틀리면 연결할수 없으므로 SQLException이 발생할수있다.*/
                                                //주소값       ip        mysql 패키지 이름
           con = DriverManager.getConnection("jdbc:mysql://localhost/employee","ohgiraffers","ohgiraffers");

            System.out.println("con : " + con);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

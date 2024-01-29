package com.ohgiraffers.section02.template.Connection;

import java.sql.Connection;

import static com.ohgiraffers.section02.template.Connection.JDBCTemplate.close;
import static com.ohgiraffers.section02.template.Connection.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {

        Connection con = getConnection();
        System.out.println("con : " + con);

        close(con);
    }
}

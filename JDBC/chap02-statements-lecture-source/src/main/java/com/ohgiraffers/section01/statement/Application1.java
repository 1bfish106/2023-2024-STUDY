package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        /*1. 우리가 설정한 db와 연결*/
        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rset = null;

        try {
            /*2. Connection 객체를 이용하여 Statement 인스턴스 생성*/
            stmt = con.createStatement();

           /*3. Statement 객체를 이용해 쿼리 구문을 저장하고 실행할수 있다
           *4. ResultSet 객체를 이용해 select의 결과 집합을 저장할 수 있다.*/
            rset = stmt.executeQuery("SELECT emp_id, emp_name FROM employee");

            /*다음행이 있니? -> id 와 name을 가져옴
            * 이제 불러올 행이 없으면 반복을 멈춘다.*/
            while(rset.next()){
                /*next() : ResultSet의 커서 위치를 하나 내리면서 행이 존재하면 true, 존재하지않으면 false를 반환*/
                /* getXXX(컬럼명) : 커서가 가리키는 행의 컬럼을 XXX 데이터 타입으로 반환한다.*/
                System.out.println(rset.getString("emp_id")+','+rset.getString("emp_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(stmt);
            close(con);
        }

        /*커넥션 개체를 다 쓰고 닫아주는 메소드*/

    }
    public static void close(Connection con) {
        /*null이 아니고 닫혀있지않을때를 조건으로 해야함*/
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void close(Statement stmt) {
        /*null이 아니고 닫혀있지않을때를 조건으로 해야함*/
        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void close(ResultSet rset) {
        /*null이 아니고 닫혀있지않을때를 조건으로 해야함*/
        try {
            if (rset != null && !rset.isClosed()) {
                rset.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

package com.ohgiraffers.section03.sqlinjection;

import java.sql.*;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;
import static com.ohgiraffers.section01.statement.Application1.close;

public class Application2 {

    /*조건절에 들어갈 내용을 예상하여 OR 1=1을 삽입하여 일부 정보만 아는 회원의 정보를 얻어올수있음
    * PreparedStatement를 사용하면 SQL Injection공격을 예방할수있다.*/
    private static String empID = "210";
    private static String empName = "'OR 1=1 AND emp_id = '200";

    public static void main(String[] args){
        String query = "SELECT * FROM employee WHERE emp_id = ? AND emp_name = ?";
        System.out.println(query);
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1,empID);
            pstmt.setString(2,empName);
            rset = pstmt.executeQuery();

            if(rset.next()){
                System.out.println(rset.getString("emp_name") + "님 환영합니다.");
            }else{
                System.out.println("회원정보가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }


    }


}

package com.ohgiraffers.section02.preparedStatement;

import java.sql.*;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;
import static com.ohgiraffers.section01.statement.Application1.close;

public class Application2 {
    public static void main(String[] args) {

        /*1. Connection 생성*/
        Connection con = getConnection();
        PreparedStatement pstmt= null;
        ResultSet rset = null;
        /*2. Connection의 prepareStatement()를 이용한 Statement 인스턴스 생성*/

        Scanner sc = new Scanner(System.in);
        System.out.println("조회하려는 사번을 입력하세요");
        String empID = sc.nextLine();
        /*? = 위치홀더 = 값을 미정으로 둔다는 뜻*/
        String query = "SELECT emp_id, emp_name FROM employee WHERE emp_id = ?";

        try {
            pstmt = con.prepareStatement(query);

            /*3. sql문의 위치홀더 설정
            *                몇번째 위치홀더에 이 값을 넣는다.*/
            pstmt.setString(1, empID);

            /*4. PrepareStatement의 executeQuery(sql)로 쿼리문 실행하고 결과를 ResultSet으로 반환 받음*/
            rset = pstmt.executeQuery();

            /*5. ResultSet에 담긴 값을 컬럼명을 이용해 꺼내어 출력*/
            if(rset.next()){
                System.out.println(rset.getString("emp_id")+ ", " + rset.getString("emp_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            /*6. 사용한 자원 반납*/
            close(rset);
            close(pstmt);
            close(con);
        }
    }
}

package com.ohgiraffers.section01.insert;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        /*ResultSet은 조회의 결과이기 때문에 insert는 필요없다.*/
        int result = 0; //insert된 row의 개수를 반환받을 변수

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop.getProperty("insertMenu");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1,"봉골레청국장");
            pstmt.setInt(2,50000);
            pstmt.setInt(3,4);
            pstmt.setString(4,"Y");

            /*삽입 수정 삭제시에는 executeUpdate() : int 메소드를 사용하여 수행 된 행의 갯수를 리턴받는다.*/
            result = pstmt.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }

        System.out.println("result : " + result);
    }
}

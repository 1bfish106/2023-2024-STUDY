package com.ohgiraffers;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            pstmt = con.prepareStatement("SELECT actor_id, last_name FROM actor");

            rset= pstmt.executeQuery();


           while(rset.next()){
               System.out.println(rset.getString("actor_id")+ ", " + rset.getString("last_name"));
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

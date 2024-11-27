package com.ohgiraffers.common;

import com.ohgiraffers.dto.CategoryDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 카테고리 코드 입력 : ");
        int catecode = sc.nextInt();

        CategoryDTO newcategory = new CategoryDTO();
        newcategory.setCatecode(catecode);

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/tblCategory-query.xml"));
            String query = prop.getProperty("deletecategory");

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, newcategory.getCatecode());

            result = pstmt.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }
        if(result > 0) {
            System.out.println("카테고리 삭제 완료!");

        }else{
            System.out.println("카테고리 삭제 실패");
        }

    }
    }


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

public class Application3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("변경할 카테고리 코드 입력 : ");
            int catecode = sc.nextInt();
            System.out.println("변경할 카테고리 이름 입력 : ");
            String catename = sc.nextLine();
            sc.nextLine();
            System.out.println("변경할 레퍼런스 코드 입력 : ");
            int refcode = sc.nextInt();

            CategoryDTO newcategory = new CategoryDTO();
            newcategory.setCatecode(catecode);
            newcategory.setCatename(catename);
            newcategory.setRefcode(refcode);

            Connection con = getConnection();
            PreparedStatement pstmt = null;
            int result = 0;

            Properties prop = new Properties();

            try {
                prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/tblCategory-query.xml"));
                String query = prop.getProperty("updatecategory");

                pstmt = con.prepareStatement(query);
                pstmt.setString(1, newcategory.getCatename());
                pstmt.setInt(2, newcategory.getRefcode());
                pstmt.setInt(3, newcategory.getCatecode());


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
                System.out.println("카테고리 변경 완료!");

            }else{
                System.out.println("카테고리 변경 실패ㅜㅜ");
            }

        }
    }


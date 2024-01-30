package com.ohgiraffers.common;

import com.ohgiraffers.dto.CategoryDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        CategoryDTO selectedCate = null;
        List<CategoryDTO> catelist = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 카테고리의 코드를 입력하세요");
        int catecode = sc.nextInt();

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/tblCategory-query.xml"));
            String query = prop.getProperty("selectcategoryname");
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,catecode);

            rset = pstmt.executeQuery();

            catelist = new ArrayList<>();
            
            while(rset.next()){
               selectedCate = new CategoryDTO();

               selectedCate.setCatecode(rset.getInt("category_code"));
               selectedCate.setCatename(rset.getString("category_name"));
                selectedCate.setCatecode(rset.getInt("ref_category_code"));

                catelist.add(selectedCate);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }

        for(CategoryDTO cate : catelist){
            System.out.println(cate);
        }
    }
}

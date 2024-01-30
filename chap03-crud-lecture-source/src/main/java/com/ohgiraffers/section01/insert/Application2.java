package com.ohgiraffers.section01.insert;

import com.ohgiraffers.model.dto.MenuDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {
        /*사용자 입력값으로 insert*/
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 이름 입력 : ");
        String menuName = sc.nextLine();
        System.out.println("메뉴 가격 입력 : ");
        int menuPrice = sc.nextInt();
        System.out.println("카테고리 코드 입력 : ");
        int categoryCode = sc.nextInt();
        System.out.println("판매여부(Y/N) 입력 : ");
        sc.nextLine();
        String orderableStatus = sc.nextLine().toUpperCase();

        /*다른 클래스의 메소드 호출 등에서 값을 뭉쳐서 보내기 위해서 DTO에 담고 전송*/

        MenuDTO newMenu = new MenuDTO();
        newMenu.setName(menuName);
        newMenu.setPrice(menuPrice);
        newMenu.setCategoryCode(categoryCode);
        newMenu.setOrderableStatus(orderableStatus);

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        /*ResultSet은 조회의 결과이기 때문에 insert는 필요없다.*/
        int result = 0; //insert된 row의 개수를 반환받을 변수

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop.getProperty("insertMenu");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, newMenu.getName());
            pstmt.setInt(2,newMenu.getPrice());
            pstmt.setInt(3,newMenu.getCategoryCode());
            pstmt.setString(4, newMenu.getOrderableStatus());

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
        if(result > 0) {
            System.out.println("메뉴 등록 완료!");

        }else{
            System.out.println("메뉴 등록 실패");
        }

    }
}


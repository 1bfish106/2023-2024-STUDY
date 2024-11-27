package com.ohgiraffers.section01.statement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;
import static com.ohgiraffers.section01.statement.Application1.close;

public class Application3 {
    public static void main(String[] args) {

        /*1. Connection 생성*/
        Connection con = getConnection();
        Statement stmt= null;
        ResultSet rset = null;
        EmployeeDTO selectedEmp = null;
        /*2. Connection의 createStatement()를 이용한 Statement 인스턴스 생성*/
        try {
            stmt = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.println("조회하려는 사번을 입력하세요");
            String empID = sc.nextLine();
            String query = "SELECT * FROM employee WHERE emp_id ='" +empID +"'";

            /*3. Statement의 executeQuery(sql)로 쿼리문 실행하고 결과를 ResultSet으로 반환 받음*/
            rset = stmt.executeQuery(query);

            /*4. ResultSet에 담긴 값을 EmployeeDTO 타입의 객체에 설정*/
            if(rset.next()){
                selectedEmp = new EmployeeDTO();

                selectedEmp.setEmpID(rset.getString("emp_id"));
                selectedEmp.setEmpName(rset.getString("emp_name"));
                selectedEmp.setEmpNo(rset.getString("emp_no"));
                selectedEmp.setEmail(rset.getString("email"));
                selectedEmp.setPhone(rset.getString("phone"));
                selectedEmp.setDeptCode(rset.getString("dept_code"));
                selectedEmp.setJobCode(rset.getString("job_code"));
                selectedEmp.setSalLevel(rset.getString("sal_level"));
                selectedEmp.setSalary(rset.getInt("salary"));
                selectedEmp.setBonus(rset.getInt("bonus"));
                selectedEmp.setManagerID(rset.getString("manager_id"));
                selectedEmp.setHireDate(rset.getDate("hire_date"));
                selectedEmp.setEntDate(rset.getDate("ent_date"));
                selectedEmp.setEntYn(rset.getString("ent_yn"));

                System.out.println("selectedEmp : " + selectedEmp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            /*5. 사용한 자원 반납*/
            close(rset);
            close(stmt);
            close(con);
        }
    }
}

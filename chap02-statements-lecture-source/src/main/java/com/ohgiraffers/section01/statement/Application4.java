package com.ohgiraffers.section01.statement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;
import static com.ohgiraffers.section01.statement.Application1.close;

public class Application4 {
    public static void main(String[] args) {

        /*1. Connection 생성*/
        Connection con = getConnection();
        Statement stmt= null;
        ResultSet rset = null;
        /*한 행의 정보를 담을 DTO*/
        EmployeeDTO selectedEmp = null;
        /*여러 DTO타입을 객체에 담을 list*/
        List<EmployeeDTO> emplist = null;


        /*2. Connection의 createStatement()를 이용한 Statement 인스턴스 생성*/
        try {
            stmt = con.createStatement();

            String query = "SELECT * FROM employee";

            /*3. Statement의 executeQuery(sql)로 쿼리문 실행하고 결과를 ResultSet으로 반환 받음*/
            rset = stmt.executeQuery(query);

            emplist = new ArrayList<>();

            /*4. ResultSet에 담긴 값을 List 타입의 객체에 설정*/
            while(rset.next()){
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

                emplist.add(selectedEmp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            /*5. 사용한 자원 반납*/
            close(rset);
            close(stmt);
            close(con);
        }

        for(EmployeeDTO employeeDTO : emplist){
            System.out.println(employeeDTO);
        }
    }
}

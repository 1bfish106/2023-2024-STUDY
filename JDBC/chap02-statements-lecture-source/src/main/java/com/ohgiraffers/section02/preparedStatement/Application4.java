package com.ohgiraffers.section02.preparedStatement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;
import static com.ohgiraffers.section01.statement.Application1.close;

public class Application4 {
    public static void main(String[] args) {

        /*XML 파일에 별도로 입력한 sql문을 통해 처리*/


        Connection con = getConnection();
        PreparedStatement pstmt= null;
        ResultSet rset = null;
        EmployeeDTO selectedEmp = null;
        List<EmployeeDTO> emplist = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 이름의 성을 입력하세요");
        String empName = sc.nextLine();

        Properties prop = new Properties();

        try {

            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section02/preparedStatement/employee-query.xml"));
            String query = prop.getProperty("selectEmpByFamilyName");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1,empName);

            rset = pstmt.executeQuery();

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
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /*5. 사용한 자원 반납*/
            close(rset);
            close(pstmt);
            close(con);
        }

        for(EmployeeDTO employeeDTO : emplist){
            System.out.println(employeeDTO);
        }
    }
}

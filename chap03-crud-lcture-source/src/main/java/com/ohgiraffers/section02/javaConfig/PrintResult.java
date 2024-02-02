package com.ohgiraffers.section02.javaConfig;

import com.ohgiraffers.section01.xmlconfig.MenuDTO;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<com.ohgiraffers.section01.xmlconfig.MenuDTO> menuList) {
        System.out.println("메뉴 목록");
        for(com.ohgiraffers.section01.xmlconfig.MenuDTO menu : menuList){
            System.out.println(menu);
        }
    }

    public void printMenu(MenuDTO menu) {
        System.out.println("====조회된 메뉴====");
        /*코드를 입력해서 나온 하나의 메뉴를 보여줌*/
        System.out.println(menu);
    }


    public void printSuccessMessage(String successCode) {
        System.out.println("==== Success ====");
        String successMessage = "";
        switch (successCode) {
            case "insert" :
                successMessage = "신규메뉴 등록이 완료 되었습니다."; break;
            case "update" :
                successMessage = "메뉴 수정이 완료 되었습니다."; break;
            case "delete" :
                successMessage = "메뉴 삭제에 성공했습니다"; break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        System.out.println("Error");
        String errorMessage = "";
        switch (errorCode) {
            case "selectList" :
                errorMessage = "메뉴 목록 조회에 실패했습니다.";
                break;
            case "selectOne" :
                errorMessage = "해당하는 코드에 맞는 메뉴 조회에 실패했습니다";
                break;
            case "insert" :
                errorMessage = "신규 메뉴 등록에 실패했습니다"; break;
            case "update" :
                errorMessage = "메뉴 수정에 실패했습니다"; break;
            case "delete" :
                errorMessage = "메뉴 삭제에 실패했습니다"; break;
        }
        System.out.println(errorMessage);
    }
}

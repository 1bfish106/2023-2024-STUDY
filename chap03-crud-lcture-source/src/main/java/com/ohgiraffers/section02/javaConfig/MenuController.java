package com.ohgiraffers.section02.javaConfig;

import com.ohgiraffers.section01.xmlconfig.MenuDTO;
import com.ohgiraffers.section01.xmlconfig.MenuService;
import com.ohgiraffers.section01.xmlconfig.PrintResult;

import java.util.List;
import java.util.Map;

public class MenuController {
    /*전달받은 값이 있으면 그걸 검증하고 가공해야할 값이 있으면 가공해야하고 추가적으로 사용자들에게
    * 보여줄 화면을 결정한다.*/
    /*이거 쓰고 메뉴서비스 클래스 만들었음
    * 파이널은 해당값이 초기화되면 한번 바뀔수없다*/
    private final MenuService menuService;
    private final PrintResult printResult;

    /* 파이널붙은 클래스를 생성자를 만들어서 초기화 해줌*/
    public MenuController(){
        menuService = new MenuService();
        printResult = new PrintResult();
    }


    public void selectAllMenu() {
    /*서비스 로직으로 요청을 이어주는 부분만 작성*/
        /*이거 먼저 써서 디티오클래스 만들었음
        *마지막으로 셀렉트올메뉴 만들어줌*/
        List<MenuDTO> menuList = menuService.selectAllMenu();

        if(menuList != null){
            printResult.printMenuList(menuList);
        }else{
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMenuByMenuCode(Map<String,String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("menuCode"));
        /*메뉴 코드를 매개변수로 전달해서 그 코드에 맞는 메뉴를 조회*/
        MenuDTO menu = menuService.selectMenuByMenuCode(menuCode);
        /*잘 죄회했을때는 메뉴를 잘 보여줄거임 아니면 에러코드를 보낼거임*/
        if(menu != null){
            printResult.printMenu(menu);
        }else{
            printResult.printErrorMessage("selectOne");
        }


    }

    public void registMenu(Map<String, String> parameter) {

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(parameter.get("menuName"));
        menu.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));
        menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));

        if(menuService.registMenu(menu)){
            printResult.printSuccessMessage("insert");

        }else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyMenu(Map<String, String> parameter) {
        MenuDTO menu = new MenuDTO();
        menu.setMenuCode((Integer.parseInt(parameter.get("menuCode"))));
        menu.setMenuName(parameter.get("menuName"));
        menu.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));
        menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));

        if(menuService.modifyMenu(menu)){
            printResult.printSuccessMessage("update");

        }else {
            printResult.printErrorMessage("update");
        }

    }

    public void deleteMenu(Map<String, String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        if(menuService.deleteMenu(menuCode)){
            printResult.printSuccessMessage("delete");

        }else {
            printResult.printErrorMessage("delete");
        }
    }
}

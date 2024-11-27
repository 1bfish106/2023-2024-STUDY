package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {
    //접근제한자
    //클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    //1. public : 모든 패키지 접근 허용
    //2. protected : 동일 패키지 접근 허용 (단, 상속 관계에 있으면 다른 패키지 접근허용)
    //3. default : 동일 패키지 접근 허용 (default를 작성하지 않는것이 default)
    //4. private : 해당 클래스 내부만 접근 허용
    //위 4가지 접근 제한자는 클래스의 멤머(필드,메소드)에 모두 가능하다
    //단, 클래스 선언시 사용하는 접근 제한자는 public과 default만 사용 가능

     private String kinds;
     private int hp;

    //문제점
    // 1. 필드값이 통제가 안됨 (필드 == 전역변수(속성), 메소드 == 기능)
    // 2. 필드 값 변경시 사용자 코드 변경 -> 유지보수성 악화
    // => 직접접근 x 간접접근 o => 캡슐화

    public void setInfo(String info){
        this.kinds = info;
    }

    public void setHp(int hp){
        if(hp > 0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }

    public String getInfo(){
        return "몬스터의 이름은 " + this.kinds + "이고, 체력은 "+this.hp + "입니다.";
    }
}

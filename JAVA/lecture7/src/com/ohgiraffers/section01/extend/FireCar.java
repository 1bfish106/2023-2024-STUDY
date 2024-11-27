package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
    //클래스 선언부에 extends Car를 추가해서 Car클래스를 상속받는다
    //그러면 FireCar는 Car의 모든 멤버(필드,메소드) 를 상속 받을수있다.
    //단, 생성자는 상속받지 못한다.
    //또한 부모의 private멤버는 접근이 불가능하다.

    public FireCar(){
        //모든 생성자에는 맨첫줄에 super()를 컴파일러가 자동으로 추가된다
        //부모의 기본 생성자를 호출하는 구문이다
        //명시적이나 묵시적으로 사용가능하다
        super();
        System.out.println("FireCar클래스의 기본 생성자를 호출한다...");
    }

    //soundHorn 메소드 오버라이딩(재작성)
    //@ <= 어노테이션 1.5버전부터 추가된 문법으로 오버라이딩 성립요건을 체크하여 성립되지않는 경우 컴파일에러를 발생시킨다
    //오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야한다.
    @Override
    public void soundHorn(){
        if(isRunning()){
            /*runningStatus는 private필드이므로 접근 불가능하며
            * 부모의 isRunning()메소드를 통해서만 주행중인 상태를 확인할수 있으므로 접근 제한자의 protected로 변경한다
            * Car 클래스의 runningStatus를 protected로 변경하여 직접 접근할수도 있지만 캡슐화의 원칙에 위배되므로 권장하지않는다.
            * this.isRunning() or super.isRunning() 둘다 사용가능하며 컴파일러는 기본적으로 this.을 추가한다.
            * (상황에 따라서는 명시적으로 super.을 써야하는 때도 있다.)*/
            System.out.println("빠아ㅏ아아아아아앙");
        }else{
            System.out.println("소방차가 앞으로 갈 수 없습니다~비키세요~~~");

        }
    }

    //상속은 자식 클래스가 부모클래스를 확장하는것이다. 따라서 FireCar만의 추가적인 기능도 작성할 수 있다
    public void sprayWater(){
        System.out.println("불난곳을 발견했습니다. 물을뿌립니다===========>>>>>>>>>>");
    }

}

package com.ohgiraffers.section02.superKeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    //기본생성자
    public Computer() {
        super();
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }
    //computer 클래스의 모든 필드를 초기화 하는 생성자

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super(); //부모클래스의 기본생성자 호출
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("computer 클래스의 모든 필드를 초기화하는 생성자 호출");
    }

    //Product클래스와 computer클래스의 모든 필드를 초기화하는 생성자

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        //부모클래스의 매개변수 생성자
        super(code, brand, name, price, manufacturingDate); //부모인스턴스를 저장하는 공간을 만들어라 하는 명령
        //this.(code, brand, name, price, manufacturingDate); 허용되지않음 super를 두번 호출하는것이기때문
        //부모인스턴스를 두개 생성할 수 없기 때문에 생성자는 한번만 호출 가능하다.
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    //getter setter는 부모 필드의 메소드에 대해서 자신의 것처럼 사용 가능하므로 별도의 작성이 필요없다
    //자식 클래스에 추가된 필드에 대해서만 작성한다.


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
  public String getInformation() {
        //부모클래스의 private멤버에는 직접접근이 불가하여 getter 메소드로 접근함
        //부모의 멤버는 super. 과 this. 모두 사용가능하나 코드의 의미를 명확히 하기위해 super.을 사용함
        //   return "Computer["
        //            +super.getCode()
        //           +super.getCode()
        //            +super.getName()
        //            +super.getPrice()
        //            +super.getManufacturingDate()
        //           +this.cpu
        //           +this.hdd
        //          +this.ram
        //        +this.operationSystem;

        //super.getInformation() : 정상적으로 부모의 메소드 호출
        //this.getInformation() : 재귀호출이 일어나며 StackOverFloin

        return super.getInformation()
                + "Computer => ["
                + "cpu = " +  this.cpu
                + "hdd = " + this.hdd
                + "manufacturingDate = " + this.operationSystem
                + " ]";

         }


}

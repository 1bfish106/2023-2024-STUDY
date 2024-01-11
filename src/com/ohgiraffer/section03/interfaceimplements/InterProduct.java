package com.ohgiraffer.section03.interfaceimplements;

public interface InterProduct extends java.io.Serializable {
//인터페이스는 인터페이스를 상속할수있다. 이때는 extends를 써서 상속한다.
//클래스를 extends 클래스 => 단일상속
//클래스 inplements 인터페이스1, 인터페이스2 = > 다중상속
//인터페이스 extends 인터페이스1, 인터페이스2 = > 다중상속

        //인터페이스는 프로덕트를 구현한다. implements를 사용
        //또한 다중 상속이 가능한데, inplements 뒤에 인터페이스를 나열하면 된다
        //클래스 inplements 구현할거, 구현할거
        //클래스 상속도 가능 대신에 구현할거 앞에 상속을 씀 상속-구현

    /* 인터페이스는 상수 필드만 작성 가능하다.
    public static final 제어자 조합을 상수 필드라고 부른다. */

        //선언과 동시에 초기화가 안돼서 컴파일 에러
        //반드시 초기화를 해줘야한다.
        public static final int MAX_NUM = 100;

        //상수필드만을 가질수있기 때문에 모든 필드는 묵시적으로 public static final이다.
        int MIN_NUM = 10;

        //인터페이스는 생성자를 가질수없다.
        //  public InterfaceProduct(){}

        //인터페이스는 구현부가 있는 non-static 메소드를 가질수없다.
        //public void nonStaticMethod(){}

        //추상메소드만 작성이 가능하다
        public abstract void nonStaticMethod();

        // 인터페이스 내 메소드는 묵시적으로 public abstract의 의미를 가진다.
        void absMethod();

        //static 메소드는 작성이 가능하다 (1.8버전부터 추가)
        public static void staticMethod(){
            System.out.println("InterfaceProduct 인터페이스의 staticMethod 호출");
        }

        //default 키워드를 사용하면 non-static 메소드도 작성이 가능하다
        //default는 오버라이딩이 강제화되지않는다
        public default void defualtMethod(){
            System.out.println("인터페이스프로덕트 인터페이스의 defualtMethod 호출");
        }

    }

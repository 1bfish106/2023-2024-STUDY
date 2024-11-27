package com.ohgiraffers.section09.objectarray;

public class Application {
    public static void main(String[] args) {
        //객체배열에 대해 이해할수있다.
        //동일 타입의 인스턴스를 여러개 사용해야 할때 객체배열을 이요하면 보다 효율적으로 사용이 가능하다

        Car[] carArr = new Car[5];

        //carArr의 각 인덱스는 기본값 NULL로 초기화되어 있기 떄문에 인덱스별로 인스턴스를 생성해야한다.
        carArr[0] = new Car("페라리", 300);
        carArr[1] = new Car("람보르기니", 300);
        carArr[2] = new Car("롤스로이스", 300);
        carArr[3] = new Car("부가티베이론", 300);
        carArr[4] = new Car("포터", 300);

        //배열은 반복문을 통해 일괄처리가 가능하다
        for (int i = 0; i < carArr.length; i++) {
            carArr[i].driveMaxSpeed();
        }

        //객체배열도 할당과 동시에 초기화할수있다.
        Car[] carArray2 = {
        new Car ("페라리", 300) ,
        new Car("람보르기니", 300),
        new Car("롤스로이스", 300),
        new Car("부가티베이론", 300),
        new Car("포터", 300)
        };

        //향상된 for문 , for each문도 사용가능 <= 값을 가져와서 사용할때
        for(Car car:carArray2){
            car.driveMaxSpeed();
        }


    }
}

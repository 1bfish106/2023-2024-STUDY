package com.ohgiraffers.looping_and_branching.section03.copy;

public class Application1 {
    public static void main(String[] args) {
        //배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다.

        //원본 배열 생성
        int[] originArr = {1,2,3,4,5};

        //얕은 복사
        int[] copyArr = originArr;

        //hashcode로 출력해서 주소 같은지 확인
        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        //반복문 활요해서 주소가 같은지 확인하기
        for ( int i = 0; i < originArr.length; i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for ( int i = 0; i < copyArr.length; i++){
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();

        //복사본 배열을 이용해 값을 변경
        copyArr[0] = 99;

        for ( int i = 0; i < originArr.length; i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();
        //복사본 배열을 통해 값을 변경했지만 원본배열에도 영향을 미친다.
        //서로같은 배열을 가리키고 있기때문이다
        for ( int i = 0; i < copyArr.length; i++){
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();
    }
}

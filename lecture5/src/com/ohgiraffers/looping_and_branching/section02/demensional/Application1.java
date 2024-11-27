package com.ohgiraffers.looping_and_branching.section02.demensional;

public class Application1 {
    public static void main(String[] args) {
        /*다차원 배열의 구조를 이해하고 사용할 수 있다.*/

        /*1. 배열의 주소를 보관할 레퍼런스 변수 선언 (stack)*/
        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        /*2. 여러개의 1차원 배열의 주소를 관리하는 배열생성 (heap)*/
        //iarr1 = new int[][]; 이거 안됨 크기를 지정하지않음
        //iarr1 = new int[][4]; 이것도 안됨 주소를 묶어서 관리할 배열의 크기를 지정하지않음
        iarr1 = new int[3][];

        /*3. 주소를 관리하는 배열의 인덱스마다 배열을 할당(heap)*/
        iarr1[0] = new int[5];  //뒤에값이 다르면 가변배열
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        /*4. 위의 2,3번을 동시에 진행 할수도 있다.
        * 앞 부분의 정수는 주소를 관리하는 배열의 크기, 뒤 부분의 정수는 각 인덱스에 할당하는 배열의 길이다.
        * 관리하는 여러개의 배열의 길이가 동일한 경우 한번에 할당할 수 있다.
        * 하지만 여러개의 배열의 길이가 각각 다른 경우에는 인덱스별로 따로 할당해 주어야 한다.*/

        iarr2 = new int[3][5]; //정변배열

        /*5. 각 배열의 인덱스에 차례로 접근해서 값 출력
        * 할당후에 아무런 값을 대입하지 않더라도 heap영역에는 값이 없는 상태로 공간을 생성할 수 없기 떄문에
        * 기본값이 담겨있다.*/

        /* 0번 인덱스의 배열 값 출력*/
        for(int i = 0; i < iarr1[0].length; i++){
            System.out.print(iarr1[0][i] + " ");
        }
        System.out.println();

        /* 1번 인덱스의 배열 값 출력*/
        for(int i = 0; i < iarr1[1].length; i++){
            System.out.print(iarr1[1][i] + " ");
        }
        System.out.println();

        /* 2번 인덱스의 배열 값 출력*/
        for(int i = 0; i < iarr1[2].length; i++){
            System.out.print(iarr1[2][i] + " ");
        }
        System.out.println();

        /*중첩 for문을 이용한 2차원 배열값의 출력*/

        for(int i = 0; i < iarr1.length; i++){
            ///행을 반복
            for (int j = 0; j < iarr1[i].length; j++){
                //열을 반복
                System.out.print(iarr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}

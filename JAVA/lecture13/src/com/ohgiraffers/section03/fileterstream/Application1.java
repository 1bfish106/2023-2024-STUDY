package com.ohgiraffers.section03.fileterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {
        //필터스트림 (보조스트림) : 기반스트림에 추가되어 성능향상 기능추가
        //BufferdReader/Writer : 버퍼 공간을 이용하여 데이터를 쌓아두었다가 입/출력해서 횟수를 줄임

        BufferedWriter bw = null;

        //보조스트림의 객체를 생성할떄는 생성자의 인자로 기반스트림을 전달한다.
        try {         //보조스트림     //기반스트림
            bw = new BufferedWriter(new FileWriter("testBufferd.txt"));

            //버퍼공간엔 쌓이기만 함
            bw.write("안녕하세요\n");
            bw.write("반갑습니다\n");
            //파일내보내기를 강제로 해야 해당 파일에 기록이 된다
            //플러쉬라는 메소드를 사용
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {  //클로즈라는 동작을 호출했을때 내부적으로 플러쉬를 실행하고 나서 자원을 반납한다.
                    //클로즈를 호출하게 되면 플러쉬가 없어도 알아서 강제 내보내기 강제 종료가 된다.
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("testBufferd.txt"))) {

            String temp;
            while((temp = br.readLine()) != null){
                System.out.println(temp);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

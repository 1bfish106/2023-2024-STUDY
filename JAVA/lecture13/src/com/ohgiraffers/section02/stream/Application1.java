package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        FileInputStream fin=null;
        //FileInputStream
        //파일이라고 하는 외부자원을 대상으로해서 연결할수있는 바이트기반의 입력스트림

        try {
            //대상 파일이 존재하지않는 경우 발생하는 FileNotFoundException 핸들링 필요
            //파일이 전송되는 통로를 만든것
        fin = new FileInputStream("testInputStrea.txt");

            int value;

         //   while((value = fin.read())!= -1){
                //1바이트씩 정보를 읽어옴
                //읽어온정보는 int타입으로 반환함
                //순차적으로 읽어오고 더 이상 읽을 데이터가 없을경우 -1을 반환함
         //       System.out.println(value);
                //유니코드로 문자를 읽어서 숫자로 실행됨
         //       System.out.println((char) value);
                //문자로 형변환
                //한글값은 "안녕"이라는 글자가 엄청나게 쪼개져서 실행됨 << 의미가 없음

                //1바이트씩 읽어오는 경우도 있지만 비효율적이다. byte배열을 통해 한번에 데이터를 불러오자
                int fileSize = (int) new File("testInputStream.txt").length();
                byte[] bar = new byte[fileSize];

                //배열로 값을 읽어온다.
                fin.read(bar);

                System.out.println(Arrays.toString(bar));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fin != null){
                try {
                    //자원반납을 해야하는 이유?
                    //1. 장기간 실행중인 프로그램에서 스트림을 닫지않으면 다양한 리소스에서 누수가 발생한다.
                    //2. 뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush() 메소드로 버퍼에 있는 데이터를 강제로 전송해야하는데
                    //만약 전류 데이터가 남은 상황에서 추가로 스트림을 사용하면 데드락 상태가 발생할수있다.
                    //버퍼는 입력값을 저장했다가 flush라는 메소드로 내보낸다.
                    //내보내는것을 까먹고 안내보내면 버퍼라는걸 쓰고싶은데 이미 선점당해서 못쓰기땜에 계속 기다리는상태가 되어버림
                    fin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

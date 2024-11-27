package com.ohgiraffers.section03.fileterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        //InputStreamReader, OutputStreamWriter
        //형변환 보조 스트림에 대해 이해하고 사용
        //기반은 바이트이고 보조는 char 기반 스트림인 경우
        //Scanner sc = new Scanner(System.in) << System.in 은 입력시스템 out은 출력 스트림

        //표준 스트림
        //자바에서는 콘솔이나 키보드 같은 표준 입출력장치로부터 데이터를 입출력하기 위한 스트림을
        //표준 스트림의 형태로 제공하고 있다. System 클래스의 필드 in out err 가 대상 데이터의 스트림을 의미
        //in (InputStream) : 콘솔로부터 데이터를 입력 받는다
        //out (PrintStream): 콘솔로 데이터를 출력한다
        //err (PrintStream): 콘솔로 데이터를 출력한다
        //자주사용되는 자원(콘솔)에 대해 미리 스트림을 생성해 두었기 떄문에 개발자가 별도로 스트림을 생성 못함


        //System.in을 InputStreamReader로 변환하여 바이트 기븐 스트림을 char 기반 스트림으로 변환한뒤
        //BufferedReader 보조 스트림과 연결한다.
        //                           문자기반         형변환(바이트를 문자로) 바이트기반
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("문자열 입력 : ");
            String value = br.readLine();
            //             한줄씩 읽어오는 기능

            System.out.println("입력받은 문자열 : " + value);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //출력을 위해서 동일한 방법
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write("im junggayeon");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

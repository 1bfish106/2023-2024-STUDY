package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        //FileWriter
        //파일아웃풋스트림과 기본사용법은 동일하나
        //바이트가 아닌 char단위로 출력 char[] 인자나 String으로 되어있어야함

        try (FileWriter fw = new FileWriter("testFileWriterStream.txt")) {

            //같은 메소드임
            fw.write(97);
            fw.write('A');

            fw.write(new char[] {'a','p','p','l','e'});

            fw.write("우리나라 대한민국");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        //FileReader 한글값도 처리

        //try with catch를 쓰면 자원반납이 자동으로 일어난다.
        try(FileReader fr = new FileReader("testReader.txt")){
            int value;
        //    while((value = fr.read())!= -1){
         //       System.out.println((char) value);
         //   }
            //바이트가 아닌 char배열로 한번에 읽어온다.
            //배열을 크기가 읽어올 문자의 개수보다 크므로 나머지 배열 공간은 빈 상태로 처리된다.
            char[] carr = new char[(int) new File("testReader.txt").length()];

            fr.read(carr);

            //asdf의 남은 공간은 네모칸으로 값이 없는것이 뜬다.
            for(char c : carr){
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        //try with resource 구문의 문법
        //1.7 버전에서 추가된문법으로 class 해야하는 인스턴스의 경우 try옆괄호안에 생성하면
        //해당 블럭이 완료 될때 자동으로 close처리가 된다.

        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"))) {

        }catch(FileNotFoundException e){
                throw new RuntimeException(e);
        } catch(IOException e){
                throw new RuntimeException(e);
        }

    }
}

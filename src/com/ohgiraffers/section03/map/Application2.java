package com.ohgiraffers.section03.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        //properties
        //고정되어있는 자료형이 있어서 제네릭 필요없음
        Properties prop = new Properties();

        prop.setProperty("driver" , "oracle.jdbc.driver.oracleDriver");
        prop.setProperty("url" , "oracle.jdbc.url.oracleDriver");
        prop.setProperty("user" , "oracle.jdbc.user.oracleDriver");
        prop.setProperty("password" , "oracle.jdbc.password.oracleDriver");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("diver.dat"),"jdbc driver");
            prop.store(new FileOutputStream("driver.txt") , "jdbd driver");
            prop.storeToXML(new FileOutputStream("driver.xml") , "jdbd driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //파일로부터 프로퍼티즈 객체에 담기
        Properties prop2 = new Properties();
        try {
           // prop2.load(new FileInputStream("driver.dat"));
           // prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("diver.xml"));
            prop2.list(System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        System.out.println(prop2.getProperty("diver"));
    }
}

package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        //file클래스의 사용법

        //1.0버전부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
        //대상 파일에 대한 정보로 인스턴스를 생성하고 파일의 생성, 삭제 등의 처리를 수행하는 기능을 제공한다.

        //파일 클래스를 이용해서 인스턴스를 생성한다.
        //대상 파일이 존재하지않아도 인스턴스를 만들수있다.
        //             이경로는 현재 프로젝트 경로로 봐야한다.
        //패스네임이라는 경로만 생긴거
        File file = new File("test.txt");

        try {
            //성공 실패 여부를 boolean타입으로 리턴함
            boolean createSucsses = file.createNewFile();
            //최초 실행시 파일이 새롭게 만들어지므로 true로 반환
            //파일이 존재할때는 새롭게 파일이 만들어지지않으므로 false로 반환
            //파일이 만들어지는것도 입출력이 실행되는것이다로 인식
            System.out.println("createSucsses : " + createSucsses);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //바이트 기준의 크기를 물어보는것 아무것도 넣어두지않았기 때문에 0으로 나타남
        System.out.println("파일의 크기 :" + file.length());
        //지금 프로젝트의 경로
        System.out.println("파일의 상대 경로 :" + file.getPath());
        System.out.println("파일의 상위 경로 :" + file.getParent());
        System.out.println("파일의 절대 경로 :" + file.getAbsolutePath());

        //파일 삭제후 성공여부를 boolean타입으로 반환
        boolean deleteSuccess = file.delete();
        System.out.println("delateSuccess : " + deleteSuccess);

    }
}

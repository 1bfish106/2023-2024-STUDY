package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        //FileOutputStream

        //핸들링이 필요하다
        //파일명은 경로를 포함해야한다.
        //경로문제 없이 파일이 존재하지않을경우에는 자동으로 파일이 생성
        //존재하지않는 경로가 포함되면 FileNotFoundException 발생
        //지금처럼 내보내면 파일 덮어쓰기 처리가 된다. 이어쓰기를 하려면 true를 추가하면 된다
        try (FileOutputStream fout = new FileOutputStream("testOutputStream.txt",true)) {

            fout.write(97);

            //Byte배열을 통해서 값을 한번에 기록할수있다.
            byte[] bar = new byte[] {98,99,100,101,102,10};
            fout.write(bar);

            //1번부터 3의 길이 만큼 파일에 풀력
            fout.write(bar,1,3);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

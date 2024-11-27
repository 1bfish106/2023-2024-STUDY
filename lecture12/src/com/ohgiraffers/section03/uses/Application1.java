package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        //예외처리를 많이 사용하는 io패키지에서 예외처리를 사용하는 구문을 이해할수있다.
        //아직 IO는 학습하지않아서 IO의 문법보다 트라이 캐치 블럭의 실제 사용과 흐름에 집중한다.
        //변수를 선언했으니깐
        BufferedReader in = null;
        try { //오류가 될 가능성이 있는애를 넣어
            //파일리더의 클래스의 생성자는 파일낫파운드익셉션으로 되어있어서
            //사용하는 쪽에서 반드시 예외 처리를 해줘야한다.
            //선언되어있는 변수에 주소값을 넣는다.
            in = new BufferedReader(new FileReader("test.dat"));

            String s;
            //readLine()메소드를 확인하려면 throws IOException으로 되어있음
            //해당 예외에 대해서도 예외 처리를 해야한다.
            while((s = in.readLine()) != null){
                System.out.println(s);
            }

            //IOException은 입출력에 관해 추상화된 예외클래스로 FileNotFoundException도 IOException의 후손이다.
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        } finally {
            //io에서 사용한 자원을 반납한다.
            try {
                //close() 메소드는 입출력에 사용한 스트림을 닫아주는 메소드로 throws IOException인 메소드기 떄문에
                //finally블럭안에 다시 예외처리르 중첩으로 해줘야한다.
                if(in != null)
                    in.close();
                //in 은 null값인데 close라는 일을 하라해서 java.lang.NullPointerException이 났다.
                //널포인터익셉션 = 런타임익셉션 이기때문에 코드를 잘짜서 확인해야한다.
                //그치만 여기에서는 null여부를 확인 후 수행하도록 한다.
                //언캐치드익셉션은 예외처리가 강제화되지않는다.
                //캐치드익셉션은 예외처리를 무조건 해야한다.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

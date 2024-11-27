package com.ohgiraffers.section03.fileterstream;

import java.io.*;

public class Application3 {

    public static void main(String[] args) {
        //DataInputStream, DataOutputStream
        //데이터 입출력 보조 스트림을 이해
        //자바에서 쓰는 자료형으로 데이터를 쓰기위해 필요

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))) {

            dout.writeUTF("정가연");
            dout.writeInt(95);
            dout.writeChar('A');

            dout.writeUTF("이순신");
            dout.writeInt(87);
            dout.writeChar('B');

            dout.writeUTF("김철수");
            dout.writeInt(77);
            dout.writeChar('C');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //인트를 데이터로 읽어온다.
        try (DataInputStream din = new DataInputStream(new FileInputStream("score.txt"))) {

            while (true) {
                //read자료형() 메소드는 파일에서 더 이상 읽어올 값이 없는경우 EOFException(end of file)을 발생시킨다
                //캐치에도 추가
                //데이터를 순서대로 작성해야함 안그럼 에러발생
                System.out.println(din.readUTF() + "," + din.readInt() + "," + din.readChar());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) { //아이오익셉션의 후손이므로 아이오익셉셥 블럭보다 위에 작성
            System.out.println("파일읽기 완료!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

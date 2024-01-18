package com.ohgiraffers.section03.fileterstream;

import java.io.*;


public class Application4 {
    public static void main(String[] args) {
        //객체단위 입출력 보조 스트림
        //ObjectInputStream, ObjectOutputStream

        //파일저장
        MemberDTO[] outputMembers = {
                new MemberDTO("user01","pass01","정가연","1bfish106@naver.com",27,'여',1235.7),
                new MemberDTO("user02","pass02","오나윤","asdfe@naver.com",25,'여',234.7),
                new MemberDTO("user03","pass03","홍길동","dfgdfg@naver.com",28,'남',3455.7)
        };

        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("testObjectOutput.txt"))) {

            for(int i = 0; i < outputMembers.length; i++){
                ob.writeObject(outputMembers[i]);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //DTO 클래스의 직렬화 처리를 하지 않았다면 실행시 java.io.NotSerializableException이 발생
        //직렬화란?
        //내부에서 사용되는 객체 또는 데이터를 외부에서도 사용할수있도록 바이트 형태로
        //데이트를 변환하는 기술
        //반대로 바이트로 변환된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 한다.


        //파일 읽기

        MemberDTO[] inputMembers = new MemberDTO[3];

        try(ObjectInputStream obi = new ObjectInputStream(new FileInputStream("testObjectOutput.txt"))){

            //readObject()메소드는 역직렬화해서 가져온 데이터를 객체화 할떄 해당하는 클래스가 없을 가능성이 있어서
            //클래스낫파운드익셉션이 필요

            for(int i = 0; i < inputMembers.length; i++) {
                //오브젝트 타입을 어떤 클래스를 불러올건지 다운캐스팅 필요
               inputMembers[i] = (MemberDTO) obi.readObject();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        for(MemberDTO memberDTO : inputMembers){
            System.out.println(memberDTO);
        }


    }

}

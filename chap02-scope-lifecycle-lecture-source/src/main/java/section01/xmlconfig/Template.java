package section01.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {

    /*SqlSessionFactory는 애플리케이션을 실행하는동안 존재해야하며
    * 애플리케이션이 실행되는 동안 여러차례 SqlSessionFactory를 다시 빌드하지 않는것이 좋은 형태이다
    * 애플리케이션 스코프로 관리하기 가장 간단한 방법은 싱글톤 패턴을 이용하는것이다
    * singleton : 오로지 1개의 객체만 생성
    * */

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession(){
        /*팩토리가 null값일때는 객체문을 생성한다는 동작을 한다. (최초생성시)*/
        if(sqlSessionFactory == null){
            String resource = "mybatis-config.xml";
            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                /*SqlSessionFactoryBuilder()를 SqlSessionFactory를 생성한 후에도 유지할필요가 없다
                * 따라서 메소드 스코프로 만든다.*/
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*Sqlsession은 Thread에 안전하지 않고 공유되지않아야하므로 요청 시마다 생성한다.*/
        SqlSession sqlSession = sqlSessionFactory.openSession(false);

        System.out.println("sqlSessionFactory.hashCode() : " + sqlSessionFactory.hashCode());
        System.out.println("sqlSession.hashCode() : " + sqlSession.hashCode());

        return null;
    }

}

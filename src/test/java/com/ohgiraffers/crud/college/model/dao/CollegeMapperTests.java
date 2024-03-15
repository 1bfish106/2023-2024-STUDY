package com.ohgiraffers.crud.college.model.dao;

import com.ohgiraffers.crud.configuration.Chap09CrudApplication;
import com.ohgiraffers.crud.college.model.dto.collegeDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ContextConfiguration(classes = {Chap09CrudApplication.class})
public class CollegeMapperTests {

    @Autowired
    private CollegeMapper collegeMapper;

    @Test
    public void 매퍼_인터페이스_의존성_주입_테스트(){
        assertNotNull(collegeMapper);
    }

    @Test
    public void 전체_대학_조회_매퍼_테스트(){
        // given 세팅값들
        //  when
        List<collegeDTO> collegeList = collegeMapper.findAllCollege();
        //then
        assertNotNull(collegeList);
    }

    @Test
    @DisplayName("신규 대학 잘 추가 되는지 매퍼 인터페이스의 메소드 확인")
    @Transactional // -> 테스트 코드로 수행한 작업을 테스트 완료후 rollback 하여 DB에 남기지 않음
    public void testRegistCollege(){
        // given
        collegeDTO college = new collegeDTO();
        college.setCollegeName("테스트소라고동");

        //when & then
        assertDoesNotThrow(() -> collegeMapper.registCollege(college));
    }

}

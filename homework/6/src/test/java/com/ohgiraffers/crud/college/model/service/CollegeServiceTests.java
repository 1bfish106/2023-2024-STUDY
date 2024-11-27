package com.ohgiraffers.crud.college.model.service;

import com.ohgiraffers.crud.college.model.dto.collegeDTO;
import com.ohgiraffers.crud.configuration.Chap09CrudApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {Chap09CrudApplication.class})
public class CollegeServiceTests {

    @Autowired
    private CollegeService collegeService;

    @Test
    public void 서비스_인터페이스_의존성_주입_테스트(){
        assertNotNull(collegeService);
    }

    @Test
    public void 전체_대학_조회_서비스_테스트(){
        // given 세팅값들
        //  when
        List<collegeDTO> collegeList = collegeService.findAllCollege();
        //then
        assertNotNull(collegeList);
    }
}

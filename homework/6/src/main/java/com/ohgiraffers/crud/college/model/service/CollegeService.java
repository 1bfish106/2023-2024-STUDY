package com.ohgiraffers.crud.college.model.service;

import com.ohgiraffers.crud.college.model.dao.CollegeMapper;
import com.ohgiraffers.crud.college.model.dto.subjectDTO;
import com.ohgiraffers.crud.college.model.dto.collegeDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/* 클레스레벨 메소드레벨 다 가능*/
/*@Transactional(value = "")*/
@Service
public class CollegeService {

    private final CollegeMapper collegeMapper;

    public CollegeService(CollegeMapper collegeMapper) {
        this.collegeMapper = collegeMapper;
    }

    public List<collegeDTO> findAllCollege() {
        return collegeMapper.findAllCollege();
    }

    /* 읽기 전용 트랜잭션 설정 가능 -> 성능 최적화*/

    @Transactional(readOnly = true)
    public List<subjectDTO> findSubjectList() {return collegeMapper.findSubjectList();
    }


    /* 메소드 내에서 하나의 트랜잭션으로 여러 처리들이 진행되고 수행 중 Exception 발생시 rollback
    * 정상 수행 완료시 commit 처리*/
    @Transactional
    public void registCollege(collegeDTO college) {
        collegeMapper.registCollege(college);
    }
}

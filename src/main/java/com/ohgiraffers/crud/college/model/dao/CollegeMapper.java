package com.ohgiraffers.crud.college.model.dao;

import com.ohgiraffers.crud.college.model.dto.subjectDTO;
import com.ohgiraffers.crud.college.model.dto.collegeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollegeMapper {

    List<collegeDTO> findAllCollege();

    List<subjectDTO> findSubjectList();

    void registCollege(collegeDTO college);
}

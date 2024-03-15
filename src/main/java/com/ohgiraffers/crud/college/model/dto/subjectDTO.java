package com.ohgiraffers.crud.college.model.dto;

public class subjectDTO {

 private String subjectName;

 private int collegeCode;

    public subjectDTO() {
    }

    public subjectDTO(String subjectName, int collegeCode) {
        this.subjectName = subjectName;
        this.collegeCode = collegeCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(int collegeCode) {
        this.collegeCode = collegeCode;
    }

    @Override
    public String toString() {
        return "subjectDTO{" +
                "subjectName='" + subjectName + '\'' +
                ", collegeCode=" + collegeCode +
                '}';
    }
}

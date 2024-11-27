package com.ohgiraffers.crud.college.model.dto;

public class collegeDTO {

    private String collegeName;

    private int collegeCode;

    public collegeDTO() {
    }

    public collegeDTO(String collegeName, int collegeCode) {
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(int collegeCode) {
        this.collegeCode = collegeCode;
    }

    @Override
    public String toString() {
        return "collegeDTO{" +
                "collegeName='" + collegeName + '\'' +
                ", collegeCode=" + collegeCode +
                '}';
    }
}


package com.ohgiraffers.dto;

public class CategoryDTO {
    private int catecode;
    private String catename;
    private int refcode;

    public CategoryDTO() {
    }

    public CategoryDTO(int catecode, String catename, int refcode) {
        this.catecode = catecode;
        this.catename = catename;
        this.refcode = refcode;
    }

    public int getCatecode() {
        return catecode;
    }

    public void setCatecode(int catecode) {
        this.catecode = catecode;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public int getRefcode() {
        return refcode;
    }

    public void setRefcode(int refcode) {
        this.refcode = refcode;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "catecode=" + catecode +
                ", catename='" + catename + '\'' +
                ", refcode=" + refcode +
                '}';
    }
}

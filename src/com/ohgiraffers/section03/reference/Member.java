package com.ohgiraffers.section03.reference;

public class Member {

    private String memberid;

    public Member() {
    }

    public Member(String memberid) {
        this.memberid = memberid;
    }


    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberid=" + memberid +
                '}';
    }
}


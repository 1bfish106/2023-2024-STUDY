package com.ohgiraffers.section03.uses.subsection03.terminal;

public class Member {
    private String member;
    private String memberId;

    public Member(String member, String memberId) {
        this.member = member;
        this.memberId = memberId;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberName(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "member='" + member + '\'' +
                ", memberName='" + memberId + '\'' +
                '}';
    }
}

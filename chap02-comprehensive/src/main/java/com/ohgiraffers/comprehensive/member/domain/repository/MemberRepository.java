package com.ohgiraffers.comprehensive.member.domain.repository;

import com.ohgiraffers.comprehensive.member.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

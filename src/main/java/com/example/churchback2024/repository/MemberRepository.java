package com.example.churchback2024.repository;

import com.example.churchback2024.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
    Member findByMemberId(Long memberId);

    Member findByName(String nickname);
}

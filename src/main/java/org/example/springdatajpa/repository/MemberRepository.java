package org.example.springdatajpa.repository;

import org.example.springdatajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member,Long> {
}

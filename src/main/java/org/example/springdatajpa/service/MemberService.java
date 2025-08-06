package org.example.springdatajpa.service;


import lombok.RequiredArgsConstructor;
import org.example.springdatajpa.dto.SignUpReponseDto;
import org.example.springdatajpa.entity.Member;
import org.example.springdatajpa.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public SignUpReponseDto signUp(String username, String password, Integer age) {

        Member member= new Member(username,password,age);

        Member savedMember= memberRepository.save(member);
        return new SignUpReponseDto(savedMember.getId(),savedMember.getUsername(),savedMember.getAge());
    }
}

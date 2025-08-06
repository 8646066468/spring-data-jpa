package org.example.springdatajpa.service;


import lombok.RequiredArgsConstructor;
import org.example.springdatajpa.dto.MemberResponseDto;
import org.example.springdatajpa.dto.SignUpReponseDto;
import org.example.springdatajpa.entity.Member;
import org.example.springdatajpa.repository.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public SignUpReponseDto signUp(String username, String password, Integer age) {

        Member member= new Member(username,password,age);

        Member savedMember= memberRepository.save(member);
        return new SignUpReponseDto(savedMember.getId(),savedMember.getUsername(),savedMember.getAge());
    }

    public MemberResponseDto findById(Long id) {

        Optional<Member> optionalMember = memberRepository.findById(id);

        // NPE 방지
        if (optionalMember.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id = " + id);
        }

        Member findMember = optionalMember.get();

        return new MemberResponseDto(findMember.getUsername(), findMember.getAge());
    }
}

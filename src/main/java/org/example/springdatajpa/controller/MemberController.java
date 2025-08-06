package org.example.springdatajpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.springdatajpa.dto.SignUpReponseDto;
import org.example.springdatajpa.dto.SignUpRequestDto;
import org.example.springdatajpa.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<SignUpReponseDto> signUp(@RequestBody SignUpRequestDto signUpRequestDto) {

       SignUpReponseDto signUpReponseDto =
               memberService.signUp(signUpRequestDto.getUsername(),signUpRequestDto.getPassword(),signUpRequestDto.getAge());

        return new ResponseEntity<>(signUpReponseDto,HttpStatus.CREATED);
    }
}

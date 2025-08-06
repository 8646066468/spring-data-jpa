package org.example.springdatajpa.dto;

import lombok.Getter;

@Getter
public class MemberResponseDto {
    private final String username;
    private final Integer age;

    public MemberResponseDto(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
}

package org.example.springdatajpa.dto;

import lombok.Getter;

@Getter
public class SignUpReponseDto {
    private final Long id;
    private final String username;
    private final Integer age;

    public SignUpReponseDto(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
}

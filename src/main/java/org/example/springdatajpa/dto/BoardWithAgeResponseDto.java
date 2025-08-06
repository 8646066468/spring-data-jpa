package org.example.springdatajpa.dto;

import lombok.Getter;

@Getter
public class BoardWithAgeResponseDto {

    private final String title;

    private final String contents;

    private final Integer age;

    public BoardWithAgeResponseDto(String title, String contents, Integer age) {
        this.title = title;
        this.contents = contents;
        this.age = age;
    }

}

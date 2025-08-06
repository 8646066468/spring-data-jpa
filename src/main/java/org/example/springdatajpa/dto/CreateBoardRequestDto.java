package org.example.springdatajpa.dto;

import lombok.Getter;

@Getter
public class CreateBoardRequestDto {

    private final String title;

    private final String contents;

    private final String username;

    public CreateBoardRequestDto(String title, String contents, String username) {
        this.title = title;
        this.contents = contents;
        this.username = username;
    }

}

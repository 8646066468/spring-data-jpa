package org.example.springdatajpa.dto;

import lombok.Getter;

@Getter
public class BoardResponseDto {
    private final Long id;

    private final String title;

    private final String contents;

    public BoardResponseDto(Long id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }
}

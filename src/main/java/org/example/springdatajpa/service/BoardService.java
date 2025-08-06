package org.example.springdatajpa.service;

import lombok.RequiredArgsConstructor;
import org.example.springdatajpa.dto.BoardResponseDto;
import org.example.springdatajpa.entity.Board;
import org.example.springdatajpa.entity.Member;
import org.example.springdatajpa.repository.BoardRepository;
import org.example.springdatajpa.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final MemberRepository memberRepository;
    private final BoardRepository boardRepository;

    public BoardResponseDto save(String title, String contents, String username) {

        Member findMember = memberRepository.findMemberByUsernameOrElseThrow(username);

        Board board = new Board(title, contents);
        board.setMember(findMember);

        boardRepository.save(board);

        return new BoardResponseDto(board.getId(), board.getTitle(), board.getContents());
    }

    public List<BoardResponseDto> findAll() {
        return boardRepository.findAll()
                .stream()
                .map(BoardResponseDto::toDto)
                .toList();
    }
}

package org.example.springdatajpa.repository;

import org.example.springdatajpa.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}

package com.example.JinuBoard.User.repository;

import com.example.JinuBoard.User.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Integer, BoardEntity> {
}

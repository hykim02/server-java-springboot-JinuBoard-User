package com.example.JinuBoard.User.repository;

import com.example.JinuBoard.User.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Integer, CommentEntity> {
}

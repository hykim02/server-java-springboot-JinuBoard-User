package com.example.JinuBoard.User.repository;

import com.example.JinuBoard.User.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Integer, PostEntity> {
}

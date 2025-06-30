package com.example.JinuBoard.User.repository;

import com.example.JinuBoard.User.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Integer, UserEntity> {
}

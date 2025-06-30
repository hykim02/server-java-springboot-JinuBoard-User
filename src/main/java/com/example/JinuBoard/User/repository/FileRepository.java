package com.example.JinuBoard.User.repository;

import com.example.JinuBoard.User.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<Integer, FileEntity> {
}

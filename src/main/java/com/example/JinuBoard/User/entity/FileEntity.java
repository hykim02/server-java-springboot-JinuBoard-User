package com.example.JinuBoard.User.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "file")
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "file_name", columnDefinition = "VARCHAR(50) DEFAULT '제목 없음'", nullable = false)
    private String fileName;

    @Column(name = "url", nullable = false, columnDefinition = "VARCHAR(100)")
    private String url;

    @Column(name = "post_id", nullable = false)
    private int postId;
}


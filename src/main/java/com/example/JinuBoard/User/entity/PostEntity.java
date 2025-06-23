package com.example.JinuBoard.User.entity;

import com.example.JinuBoard.User.enumerate.Category;
import com.example.JinuBoard.User.enumerate.State;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "board_id", nullable = false)
    private int boardId;

    @Column(name = "title", nullable = false, columnDefinition = "VARCHAR(50) DEFAULT '제목 없음'")
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false, columnDefinition = "DEFAULT 'submit'")
    private State state;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false, columnDefinition = "DEFAULT 'etc'")
    private Category category;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;
}

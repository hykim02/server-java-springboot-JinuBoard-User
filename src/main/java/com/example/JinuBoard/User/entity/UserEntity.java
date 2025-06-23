package com.example.JinuBoard.User.entity;

import com.example.JinuBoard.User.enumerate.Role;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nickname", columnDefinition = "VARCHAR(20)", nullable = false, unique = true)
    private String nickname;

    @Column(name = "college_number", columnDefinition = "CHAR(10)", nullable = false, unique = true)
    private String collegeNumber;

    @Column(name = "major", columnDefinition = "VARCHAR(20)", nullable = false)
    private String major;

    @Column(name = "kakao_id", unique = true, nullable = false)
    private long kakaoId;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "refresh_token", columnDefinition = "VARCHAR(100)", nullable = false, unique = true)
    private String refreshToken;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
}

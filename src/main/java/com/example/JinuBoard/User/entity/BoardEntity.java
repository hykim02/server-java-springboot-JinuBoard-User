package com.example.JinuBoard.User.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "board")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", columnDefinition = "VARCHAR(10)", nullable = false)
    private String name;
}

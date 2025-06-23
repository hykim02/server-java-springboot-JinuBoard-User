package com.example.JinuBoard.User.enumerate;

import lombok.Getter;

@Getter
public enum Role {
    USER("사용자"),
    ADMIN("관리자");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

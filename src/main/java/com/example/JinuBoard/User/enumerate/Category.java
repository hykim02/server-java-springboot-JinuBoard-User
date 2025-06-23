package com.example.JinuBoard.User.enumerate;

import lombok.Getter;

@Getter
public enum Category {
    REQUEST("기능 요청"),
    BUG("버그 신고"),
    UPDATE("서비스 개선 제안"),
    ETC("기타");

    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}

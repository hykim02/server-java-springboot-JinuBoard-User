package com.example.JinuBoard.User.enumerate;

import lombok.Getter;

@Getter
public enum State {
    SUBMIT("제출"),
    IN_PROGRESS("진행 중"),
    DONE("반영");

    private String state;

    State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

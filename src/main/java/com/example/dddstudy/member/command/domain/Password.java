package com.example.dddstudy.member.command.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Password {
    private String value;

    public boolean match(String password) {
        return this.value.equals(password);
    }
}

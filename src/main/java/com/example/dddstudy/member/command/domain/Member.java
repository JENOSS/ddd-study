package com.example.dddstudy.member.command.domain;

import com.example.dddstudy.member.PasswordNotMatchException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Member {
    private Password password;

    public void changePassword(String currentPassword, String newPassword) {
        if (!password.match(currentPassword)) {
            throw new PasswordNotMatchException();
        }

        this.password = new Password(newPassword);
    }

}

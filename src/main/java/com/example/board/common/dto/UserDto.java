package com.example.board.common.dto;

import com.example.board.domain.User.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    private String id;
    private String password;
    private String name;

    public User toEntity() {
        return User.builder().id(id).password(password).name(name).build();
    }
}

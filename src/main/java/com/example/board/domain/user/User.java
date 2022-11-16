package com.example.board.domain.user;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class User {
    private String id;
    private String password;
    private String name;
    private int role;
}

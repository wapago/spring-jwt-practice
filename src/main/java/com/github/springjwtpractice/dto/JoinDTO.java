package com.github.springjwtpractice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class JoinDTO {

    private String username;
    private String password;
}

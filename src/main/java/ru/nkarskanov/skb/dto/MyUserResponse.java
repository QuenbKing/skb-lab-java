package ru.nkarskanov.skb.dto;

import lombok.Data;

@Data
public class MyUserResponse {
    private String username;
    private String password;

    public MyUserResponse(MyUserRequest myUserRequest) {
        this.username = myUserRequest.getUsername();
        this.password = myUserRequest.getPassword();
    }
}
package ru.nkarskanov.skb.dto;

import lombok.Data;
import ru.nkarskanov.skb.validation.PasswordConstraint;
import ru.nkarskanov.skb.validation.UsernameConstraint;

@Data
public class MyUserRequest {
    @UsernameConstraint
    private String username;
    @PasswordConstraint
    private String password;
}
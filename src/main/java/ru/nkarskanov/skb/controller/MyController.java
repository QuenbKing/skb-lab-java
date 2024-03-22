package ru.nkarskanov.skb.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.nkarskanov.skb.dto.MyUserRequest;
import ru.nkarskanov.skb.dto.MyUserResponse;

@RestController
@Validated
public class MyController {
    @PostMapping("/user")
    public ResponseEntity<MyUserResponse> createUser(@Valid @RequestBody MyUserRequest myUserRequest) {
        return new ResponseEntity<>(new MyUserResponse(myUserRequest), HttpStatus.OK);
    }
}
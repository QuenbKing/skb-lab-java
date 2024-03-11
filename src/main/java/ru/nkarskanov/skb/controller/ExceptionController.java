package ru.nkarskanov.skb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.nkarskanov.skb.error.MyException;

@RestController
@RequestMapping("/myException")
public class ExceptionController {
    @GetMapping
    public ResponseEntity<String> getBadGateway(@RequestParam(defaultValue = "true") boolean exception) {
        if (exception) {
            throw new MyException();
        }
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}

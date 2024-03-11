package ru.nkarskanov.skb.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(MyException.class)
    public ResponseEntity<MyException> getBadGatewayException(MyException ex) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(ex);
    }
}

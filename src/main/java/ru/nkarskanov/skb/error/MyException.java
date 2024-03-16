package ru.nkarskanov.skb.error;

public class MyException extends RuntimeException {

    public MyException() {
        super("Error 502: An error occurred on the server");
    }
}

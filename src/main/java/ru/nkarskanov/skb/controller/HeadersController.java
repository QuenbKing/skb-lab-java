package ru.nkarskanov.skb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/allHeaders")
public class HeadersController {
    @GetMapping
    public Map<String, String> getAllHeaders(@RequestHeader Map<String, String> headers) {
        return headers;
    }
}

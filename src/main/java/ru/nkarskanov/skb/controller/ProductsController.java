package ru.nkarskanov.skb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nkarskanov.skb.dto.InfoResponse;
import ru.nkarskanov.skb.dto.ProductRequest;
import ru.nkarskanov.skb.dto.ProductResponse;

@RestController
@RequestMapping("/product")
public class ProductsController {
    @PostMapping
    public ProductResponse getProduct(@RequestBody ProductRequest productRequest) {
        return new ProductResponse(productRequest.price(), new InfoResponse(123, productRequest.info().date()));
    }
}

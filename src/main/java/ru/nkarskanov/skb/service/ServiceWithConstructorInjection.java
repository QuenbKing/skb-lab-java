package ru.nkarskanov.skb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.nkarskanov.skb.entity.Transport;

@Log4j2
@Service
@RequiredArgsConstructor
public class ServiceWithConstructorInjection {
    private final Transport car;
    private final Transport boat;

    @PostConstruct
    private void init() {
        log.info("ConstructService is working");
    }

    @PreDestroy
    private void destroy() {
        log.info("ConstructService is destroying");
    }

    public void moveTransport() {
        car.move();
        boat.move();
    }

    public void stopTransport() {
        car.stop();
        car.stop();
    }
}

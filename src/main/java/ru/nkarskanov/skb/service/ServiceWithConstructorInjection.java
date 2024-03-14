package ru.nkarskanov.skb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.nkarskanov.skb.entity.Transport;

@Log4j2
@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ServiceWithConstructorInjection {
    Transport car;
    Transport boat;

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
        boat.stop();
    }
}

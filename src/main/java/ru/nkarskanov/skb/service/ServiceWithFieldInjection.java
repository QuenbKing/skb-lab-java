package ru.nkarskanov.skb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nkarskanov.skb.entity.Transport;

@Log4j2
@Service
public class ServiceWithFieldInjection {
    @Autowired
    private Transport car;
    @Autowired
    private Transport boat;

    @PostConstruct
    private void init() {
        log.info("FieldService is working");
    }

    @PreDestroy
    private void destroy() {
        log.info("FieldService is destroying");
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

package ru.nkarskanov.skb.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nkarskanov.skb.entity.Transport;

@Log4j2
@Service
public class ServiceWithSetterInjection {
    private Transport car;
    private Transport boat;

    @Autowired
    private void setCar(Transport car) {
        this.car = car;
    }

    @Autowired
    private void setBoat(Transport boat) {
        this.boat = boat;
    }

    @PostConstruct
    private void init() {
        log.info("SetterService is working");
    }

    @PreDestroy
    private void destroy() {
        log.info("SetterService is destroying");
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

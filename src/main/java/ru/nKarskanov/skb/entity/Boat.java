package ru.nKarskanov.skb.entity;

import org.springframework.stereotype.Component;

@Component
public class Boat implements Transport {
    @Override
    public void move() {
        System.out.println("The boat is sailing");
    }

    @Override
    public void stop() {
        System.out.println("The boat moored to the shore");
    }
}

package ru.nkarskanov.skb.entity;

import org.springframework.stereotype.Component;

@Component
public class Car implements Transport {

    @Override
    public void move() {
        System.out.println("The car is driving on the road");
    }

    @Override
    public void stop() {
        System.out.println("The car stopped at the side of the road");
    }
}

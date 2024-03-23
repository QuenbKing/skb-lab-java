package ru.nkarskanov.skb.beans;

import lombok.extern.log4j.Log4j2;
import ru.nkarskanov.skb.properties.MyProperties;

@Log4j2
public class SecondBean extends Bean {
    public SecondBean(MyProperties myProperties) {
        super(myProperties);
    }
}

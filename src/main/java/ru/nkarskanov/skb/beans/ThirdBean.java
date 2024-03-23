package ru.nkarskanov.skb.beans;

import lombok.extern.log4j.Log4j2;
import ru.nkarskanov.skb.properties.MyProperties;

@Log4j2
public class ThirdBean extends Bean {
    public ThirdBean(MyProperties myProperties) {
        super(myProperties);
    }
}

package ru.nkarskanov.skb.beans;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import ru.nkarskanov.skb.properties.MyProperties;

import java.util.List;

@Log4j2
public abstract class Bean {
    private final String appName;
    private final List<String> list;
    private final String env;

    public Bean(MyProperties myProperties) {
        this.appName = myProperties.getName();
        this.list = myProperties.getList();
        this.env = myProperties.getEnv();
    }

    @PostConstruct
    private void postConstruct() {
        log.info("className: {} appName: {}, list: {}, env: {}",
                this.getClass().getSimpleName(), appName, list, env);
    }
}

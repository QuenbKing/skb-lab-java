package ru.nkarskanov.skb.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Getter
@Setter
@ConfigurationProperties(prefix = "app")
public class MyProperties {
    private List<String> list;
    private String name;
    private String env;
}

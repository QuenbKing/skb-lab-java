package ru.nkarskanov.skb.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.nkarskanov.skb.beans.FirstBean;
import ru.nkarskanov.skb.beans.SecondBean;
import ru.nkarskanov.skb.beans.ThirdBean;
import ru.nkarskanov.skb.properties.MyProperties;

@Configuration
@EnableConfigurationProperties(MyProperties.class)
@RequiredArgsConstructor
public class BeansConfiguration {
    private final MyProperties myProperties;

    @Bean
    @Profile("test")
    public FirstBean createFirstBean() {
        return new FirstBean(myProperties);
    }

    @Bean
    @ConditionalOnBean(FirstBean.class)
    public SecondBean createSecondBean() {
        return new SecondBean(myProperties);
    }

    @Bean
    @ConditionalOnExpression("'${app.env}' != 'default'")
    public ThirdBean createThirdBean() {
        return new ThirdBean(myProperties);
    }
}

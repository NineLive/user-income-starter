package ru.mystarter.userincome;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(IncomeClientProperties.class)
public class IncomeClientAutoconfiguration {
    @Bean
    public IncomeClient userIncome(){
        return new IncomeClient();
    }
}

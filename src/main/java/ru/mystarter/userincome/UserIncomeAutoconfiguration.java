package ru.mystarter.userincome;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserIncomeProperties.class)
public class UserIncomeAutoconfiguration {
    @Bean
    public UserIncome userIncome(){
        return new UserIncome();
    }
}

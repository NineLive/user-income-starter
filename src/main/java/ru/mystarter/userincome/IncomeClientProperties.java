package ru.mystarter.userincome;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties(prefix = "loan")
public class IncomeClientProperties {
    private String userIncomeUrl;
}

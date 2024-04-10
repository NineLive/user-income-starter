package ru.mystarter.userincome;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "loan")
public class UserIncomeProperties {
    private String userIncomeUrl;

    public String getUserIncomeUrl() {
        return userIncomeUrl;
    }

    public void setUserIncomeUrl(String userIncomeUrl) {
        this.userIncomeUrl = userIncomeUrl;
    }
}

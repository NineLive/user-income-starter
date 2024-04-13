package ru.mystarter.userincome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class IncomeClient {

    @Autowired
    private IncomeClientProperties incomeClientProperties;

    public double getUserIncome(long id){
        RestTemplate restTemplate = new RestTemplate();
        String url = incomeClientProperties.getUserIncomeUrl();
        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
        ResponseEntity<List<UserIncomeDTO>> responseEntity = restTemplate.exchange(url, HttpMethod.GET,null,
                new ParameterizedTypeReference<>() { });
        for (UserIncomeDTO userIncomeDTO : responseEntity.getBody()) {
            if (id == userIncomeDTO.getId()) {
                return userIncomeDTO.getIncome();
            }
        }
        return 0;
    }
}

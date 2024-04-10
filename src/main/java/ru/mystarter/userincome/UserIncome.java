package ru.mystarter.userincome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class UserIncome {

    @Autowired
    private UserIncomeProperties userIncomeProperties;
    public List<UserIncomeDTO> getListUserIncome(){
        RestTemplate restTemplate = new RestTemplate();
        String url = userIncomeProperties.getUserIncomeUrl();
        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
        ResponseEntity<List<UserIncomeDTO>> responseEntity = restTemplate.exchange(url, HttpMethod.GET,null,
                new ParameterizedTypeReference<>() { });
        return responseEntity.getBody();
    }
}

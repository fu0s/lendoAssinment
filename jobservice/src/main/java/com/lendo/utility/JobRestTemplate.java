package com.lendo.utility;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lendo.model.ApplicationStatusModel;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class JobRestTemplate {

    public String createJobUrl ;
    public RestTemplateBuilder restTemplateBuilder;
    public RestTemplate restTemplate ;

    public JobRestTemplate() {
        createJobUrl = "http://localhost:8000/api/jobs?application_id={application_id}";
        restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.errorHandler(new RestTemplateResponseErrorHandler()).build();
        restTemplate = new RestTemplate();
    }

    public ResponseEntity get(String application_id){
        ResponseEntity response = restTemplate.exchange(createJobUrl, HttpMethod.GET, null,ApplicationStatusModel.class, application_id);
        return response;
    }
}
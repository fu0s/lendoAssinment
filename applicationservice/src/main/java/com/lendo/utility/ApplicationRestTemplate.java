package com.lendo.utility;

import com.lendo.model.ApplicationModel;
import com.lendo.model.ApplicationResponseModel;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * coustomised restetmplate
 */
public final class ApplicationRestTemplate {

    public String createApplicationUrl ;
    public RestTemplateBuilder restTemplateBuilder;
    public RestTemplate restTemplate ;

    /**
     * customised rest template constructor
     */
    public ApplicationRestTemplate() {
        createApplicationUrl = "http://localhost:8000/api/applications";
        restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.errorHandler(new RestTemplateResponseErrorHandler()).build();
        restTemplate = new RestTemplate();
    }

    /**
     * customised POST rest service
     * @param application
     * @return
     */
    public ResponseEntity post(ApplicationModel application){
       HttpEntity<ApplicationModel> request = new HttpEntity<>(application);
       ResponseEntity response = restTemplate.exchange(createApplicationUrl, HttpMethod.POST, request, ApplicationResponseModel.class);
       return response;
    }

}

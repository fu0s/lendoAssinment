package com.lendo.controller;

import com.lendo.model.ApplicationModel;
import com.lendo.model.ApplicationResponseModel;
import com.lendo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    /**
     * rest controller for creating application
     * @param application first name and last name of applicant
     * @return interview service response body
     */
    @RequestMapping(method = RequestMethod.POST)
    public ApplicationResponseModel createApplication(ApplicationModel application){
        return applicationService.createApplication(application);
    }
}

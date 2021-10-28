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

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createApplication(ApplicationModel application){
        return applicationService.createApplication(application);
    }
}

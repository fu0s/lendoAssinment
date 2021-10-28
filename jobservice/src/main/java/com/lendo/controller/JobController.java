package com.lendo.controller;


import com.lendo.model.ApplicationStatusModel;
import com.lendo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping(method = RequestMethod.GET)
    public ApplicationStatusModel createApplication(String application_id){
        return jobService.getStatus(application_id);
    }
}

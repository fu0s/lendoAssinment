package com.lendo.service.impl;

import com.lendo.model.ApplicationStatusModel;
import com.lendo.service.JobService;
import com.lendo.utility.JobRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

    @Override
    public ApplicationStatusModel getStatus(String application_id){
        JobRestTemplate query = new JobRestTemplate();
        return (ApplicationStatusModel) query.get(application_id).getBody();
    }
}

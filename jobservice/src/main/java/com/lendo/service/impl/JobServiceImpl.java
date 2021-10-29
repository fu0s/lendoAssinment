package com.lendo.service.impl;

import com.lendo.DAO.ApplicationDAO;
import com.lendo.DAO.entity.ApplicationUpdateEntity;
import com.lendo.model.ApplicationStatusModel;
import com.lendo.service.JobService;
import com.lendo.utility.JobRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    ApplicationDAO applicationDAO;

    @Override
    public ApplicationStatusModel getStatus(String application_id){
        JobRestTemplate query = new JobRestTemplate();
        ApplicationUpdateEntity applicationUpdateEntity = new ApplicationUpdateEntity();
        ApplicationStatusModel response = null;
        int counter = 0;

        while(counter == 0){
            response = (ApplicationStatusModel) query.get(application_id).getBody();
            if (response != null && !"pending".equals(response.getStatus().toString())){
                applicationUpdateEntity = mapper(response);
                applicationDAO.save(applicationUpdateEntity);
                counter = 1;
            }
        }

        return response;
    }

    public ApplicationUpdateEntity mapper(ApplicationStatusModel app){
        ApplicationUpdateEntity applicationUpdateEntity = new ApplicationUpdateEntity();
        applicationUpdateEntity.setJob_id(app.getId().toString());
        applicationUpdateEntity.setApplication_id(app.getApplication_id().toString());
        applicationUpdateEntity.setStatus(app.getStatus().toString());
        return  applicationUpdateEntity;
    }
}

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

    /**
     * service to get application status and storing status in DB
     * @param application_id the application id
     * @return interview service body
     */
    @Override
    public ApplicationStatusModel getStatus(String application_id){
        JobRestTemplate query = new JobRestTemplate();
        ApplicationUpdateEntity applicationUpdateEntity;
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

    /**
     * mapper entity to DOM for application status
     * @param app DOM
     * @return entity
     */
    public ApplicationUpdateEntity mapper(ApplicationStatusModel app){
        ApplicationUpdateEntity applicationUpdateEntity = new ApplicationUpdateEntity();
        applicationUpdateEntity.setJob_id(app.getId().toString());
        applicationUpdateEntity.setApplication_id(app.getApplication_id().toString());
        applicationUpdateEntity.setStatus(app.getStatus().toString());
        return  applicationUpdateEntity;
    }
}

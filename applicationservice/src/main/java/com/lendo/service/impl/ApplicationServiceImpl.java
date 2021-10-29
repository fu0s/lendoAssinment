package com.lendo.service.impl;

import com.lendo.DAO.ApplicationDAO;
import com.lendo.DAO.entity.ApplicationEntity;
import com.lendo.model.ApplicationModel;
import com.lendo.model.ApplicationResponseModel;
import com.lendo.service.ApplicationService;
import com.lendo.utility.ApplicationRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    ApplicationDAO applicationDAO;

    @Override
    public ApplicationResponseModel createApplication(ApplicationModel application) {
        ApplicationRestTemplate query = new ApplicationRestTemplate();
        ApplicationEntity applicationEntity = new ApplicationEntity();
        ApplicationResponseModel response = null;
        response = (ApplicationResponseModel) query.post(application).getBody();
        if (response != null){
            applicationEntity.setApplication_id(response.getId().toString());
            applicationDAO.save(applicationEntity);
        }
        return response;
    }
}

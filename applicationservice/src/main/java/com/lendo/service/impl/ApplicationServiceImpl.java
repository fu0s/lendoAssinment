package com.lendo.service.impl;

import com.lendo.model.ApplicationModel;
import com.lendo.model.ApplicationResponseModel;
import com.lendo.service.ApplicationService;
import com.lendo.utility.ApplicationRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Override
    public ResponseEntity<ApplicationResponseModel> createApplication(ApplicationModel application) {
        ApplicationRestTemplate query = new ApplicationRestTemplate();
        return query.post(application);
    }
}

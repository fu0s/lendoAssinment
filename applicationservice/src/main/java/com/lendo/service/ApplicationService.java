package com.lendo.service;

import com.lendo.model.ApplicationModel;
import com.lendo.model.ApplicationResponseModel;
import org.springframework.http.ResponseEntity;

public interface ApplicationService {

    ResponseEntity<ApplicationResponseModel> createApplication(ApplicationModel application);
}

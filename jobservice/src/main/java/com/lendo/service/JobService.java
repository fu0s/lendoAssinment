package com.lendo.service;

import com.lendo.model.ApplicationStatusModel;
import org.springframework.http.ResponseEntity;

public interface JobService {
    ApplicationStatusModel getStatus(String application_id);
}

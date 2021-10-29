package com.lendo.service.impl;

import com.lendo.DAO.ApplicationDAO;
import com.lendo.DAO.entity.ApplicationUpdateEntity;
import com.lendo.model.ApplicationStatusModel;
import com.lendo.model.Status;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.Assert;

import java.util.UUID;


import static org.mockito.Mockito.when;

class JobServiceImplTest {

    @InjectMocks
    private JobServiceImpl jobService ;

    @Mock
    private ApplicationDAO applicationDAO;
    @Test
    void getStatus() {

        String application_id = "372c3849-a01b-4eb3-8c18-6f32f0b588ef";
        ApplicationStatusModel applicationStatusModel = new ApplicationStatusModel();
        applicationStatusModel.setId(UUID.fromString("ef29a441-68a4-4d07-9cf8-206c977b5ab4"));
        applicationStatusModel.setApplication_id(UUID.fromString(application_id));
        applicationStatusModel.setStatus(Status.COMPLETED);
        ApplicationUpdateEntity entity = new ApplicationUpdateEntity();


        when(applicationDAO.save(Mockito.any(ApplicationUpdateEntity.class))).thenReturn(entity);
        ApplicationStatusModel status = jobService.getStatus(application_id);
        Assert.assertNotNull(status);
        Assert.assertEquals(Status.COMPLETED, status.getStatus());
        Assert.assertEquals("372c3849-a01b-4eb3-8c18-6f32f0b588ef", status.getApplication_id().toString());
        Assert.assertEquals("ef29a441-68a4-4d07-9cf8-206c977b5ab4", status.getId().toString());

    }

    @Test
    void mapper() {
    }
}
package com.lendo.service.impl;

import com.lendo.DAO.ApplicationDAO;
import com.lendo.DAO.entity.ApplicationEntity;
import com.lendo.model.ApplicationModel;
import com.lendo.model.ApplicationResponseModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class ApplicationServiceImplTest {
    @InjectMocks
    private ApplicationServiceImpl applicationService ;

    @Mock
    private ApplicationDAO applicationDAO;



    @Test
    void createApplication() {

        ApplicationModel model = new ApplicationModel("John","Doe");
        ApplicationEntity applicationEntity = new ApplicationEntity();
        applicationEntity.setApplication_id(model.getId());


        when(applicationDAO.save(Mockito.any(ApplicationEntity.class))).thenReturn(applicationEntity);
        ApplicationResponseModel response = applicationService.createApplication(model);
        Assert.assertNotNull(response);


    }
}
package com.lendo.DAO;

import com.lendo.DAO.entity.ApplicationUpdateEntity;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationDAO extends CrudRepository<ApplicationUpdateEntity, Long> {



    ApplicationUpdateEntity save(ApplicationUpdateEntity entity) ;

}

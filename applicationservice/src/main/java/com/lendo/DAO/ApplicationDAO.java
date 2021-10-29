package com.lendo.DAO;

import com.lendo.DAO.entity.ApplicationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationDAO extends CrudRepository<ApplicationEntity, Long> {



    ApplicationEntity save(ApplicationEntity entity) ;

}

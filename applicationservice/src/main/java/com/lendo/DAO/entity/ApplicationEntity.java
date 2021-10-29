package com.lendo.DAO.entity;

import javax.persistence.*;

@Entity
@Table(name = "APPLICATION")
public class ApplicationEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    int id;

    @Column(name = "application_id")
    String application_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApplication_id() {
        return application_id;
    }

    public void setApplication_id(String application_id) {
        this.application_id = application_id;
    }
}

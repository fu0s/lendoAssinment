package com.lendo.DAO.entity;

import javax.persistence.*;

/**
 * application id , status and job id to be stored in DB
 */
@Entity
@Table(name = "APPLICATIONUPDATE")
public class ApplicationUpdateEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    int id;

    @Column(name = "job_id")
    String job_id;

    @Column(name = "application_id")
    String application_id;

    @Column(name = "status")
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getApplication_id() {
        return application_id;
    }

    public void setApplication_id(String application_id) {
        this.application_id = application_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

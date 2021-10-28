package com.lendo.model;

import java.io.Serializable;
import java.util.UUID;

public class ApplicationResponseModel implements Serializable {

    private UUID id;

    private  String status;

    private String first_name;

    private String last_name;

    public ApplicationResponseModel(){}

    public ApplicationResponseModel(UUID id, String status, String first_name, String last_name) {
        this.id = id;
        this.status = status;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}

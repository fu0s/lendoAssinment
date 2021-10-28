package com.lendo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class ApplicationStatusModel {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("application_id")
    private UUID application_id;

    @JsonProperty("status")
    private Status status;

    public ApplicationStatusModel(){}
    public ApplicationStatusModel(UUID id, UUID application_id, Status status) {
        this.id = id;
        this.application_id = application_id;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getApplication_id() {
        return application_id;
    }

    public void setApplication_id(UUID application_id) {
        this.application_id = application_id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

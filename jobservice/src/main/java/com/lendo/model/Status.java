package com.lendo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Status {

    @JsonProperty("completed")
    COMPLETED("completed"),
    @JsonProperty("rejected")
    REJECTED("rejected"),
    @JsonProperty("pending")
    PENDING("pending");

    private String status;

    Status(){}
    Status(String status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return status;
    }

    public String getStatus() {
        return status;
    }
}

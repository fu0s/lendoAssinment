package com.lendo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * enum class of application status
 * NB : pending is not supposed to be here according to interview service but maybe it was a mistake
 */
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

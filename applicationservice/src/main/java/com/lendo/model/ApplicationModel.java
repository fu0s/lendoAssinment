package com.lendo.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * applicant DOM
 */
public class ApplicationModel implements Serializable {

    /**
     * applicantion id generated randomly with UUID format
     */
    private String id;

    /**
     * applicant first name
     */
    private String first_name;

    /**
     * applicant last name
     */
    private String last_name;

    public ApplicationModel( String first_name, String last_name) {
        this.id =  UUID.randomUUID().toString();;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

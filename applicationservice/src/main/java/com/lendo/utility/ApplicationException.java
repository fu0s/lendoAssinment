package com.lendo.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public class ApplicationException extends IOException {

    /**
     * exception
     * @param errorMessage the text that will be displayed to the user
     */
    public ApplicationException(String errorMessage) {
        super(errorMessage);
    }
}

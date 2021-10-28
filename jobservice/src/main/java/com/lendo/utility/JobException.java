package com.lendo.utility;

import java.io.IOException;

public class JobException extends IOException {


    /**
    * exception
    * @param errorMessage the text that will be displayed to the user
    */
    public JobException(String errorMessage) {
        super(errorMessage);
        }
}

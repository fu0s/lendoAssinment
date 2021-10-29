package com.lendo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JobserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobserviceApplication.class, args);
    }

}
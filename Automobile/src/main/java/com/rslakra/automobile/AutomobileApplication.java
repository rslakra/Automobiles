package com.rslakra.automobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AutomobileApplication extends SpringBootServletInitializer {


    //comment below if deploying outside web container -->
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AutomobileApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AutomobileApplication.class);
    }
}
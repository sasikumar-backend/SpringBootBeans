package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CakeBakerConfig {

    // Read the frosting and syrup type from the application.properties
    @Value("${cake.frosting.type}")
    private String frostingType;

    @Value("${cake.syrup.type}")
    private String syrupType;

    @Bean
    public FrostingInterface frostingInterface() {
        // Dynamically choose the right frosting based on the property
        if ("chocolate".equals(frostingType)) {
            return new ChoclateFrosting();
        } else {
            return new StrawberryFrosting();
        }
    }

    @Bean
    public SyrupInterface syrupInterface() {
        // Dynamically choose the right syrup based on the property
        if ("chocolate".equals(syrupType)) {
            return new ChoclateSyrup();
        } else {
            return new StrawberrySyrup();
        }
    }
}

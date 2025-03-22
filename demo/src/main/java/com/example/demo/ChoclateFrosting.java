package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ChoclateFrosting implements FrostingInterface{
    @Override
    public String getFrostingType() {
        return "get chocolate frosting type";
    }
}

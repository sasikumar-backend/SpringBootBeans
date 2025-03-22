package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ChoclateSyrup implements SyrupInterface{
    @Override
    public String getSyrupType() {
        return "get chocloate syrup type";
    }
}

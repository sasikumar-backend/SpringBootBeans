package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CakeBaker {

  private final FrostingInterface frostingInterface;

  private final SyrupInterface syrupInterface;

  @Autowired
    public CakeBaker(FrostingInterface frostingInterface, SyrupInterface syrupInterface) {
        this.frostingInterface = frostingInterface;
        this.syrupInterface = syrupInterface;
    }

    public void bakeCake(){
        System.out.println(frostingInterface.getFrostingType());
        System.out.println( syrupInterface.getSyrupType());
    }
}

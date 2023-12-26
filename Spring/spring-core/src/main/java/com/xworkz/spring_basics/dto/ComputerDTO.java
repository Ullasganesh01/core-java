package com.xworkz.spring_basics.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mycomp")
public class ComputerDTO {
    @Value("1")
    private int computerID;
    @Value("Lenovo")
    private String compName;
    @Autowired
    private OperatingSystemDTO operatingSystem;

    @Override
    public String toString() {
        return "ComputerDTO{" +
                "computerID=" + computerID +
                ", compName='" + compName + '\'' +
                ", operatingSystem=" + operatingSystem +
                '}';
    }
}

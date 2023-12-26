package com.xworkz.spring_basics.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OperatingSystemDTO {
    @Value("1")
    private int odID;
    @Value("windows")
    private String osName;

    @Override
    public String toString() {
        return "OperatingSystemDTO{" +
                "odID=" + odID +
                ", osName='" + osName + '\'' +
                '}';
    }
}

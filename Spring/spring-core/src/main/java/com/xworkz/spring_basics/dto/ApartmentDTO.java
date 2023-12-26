package com.xworkz.spring_basics.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApartmentDTO {
    @Value("1")
    private int apartmentID;
    @Value("bren")
    private String apartmentName;
    @Autowired
    private FlatDTO flat;

    @Override
    public String toString() {
        return "ApartmentDTO{" +
                "apartmentID=" + apartmentID +
                ", apartmentName='" + apartmentName + '\'' +
                ", flat=" + flat +
                '}';
    }
}

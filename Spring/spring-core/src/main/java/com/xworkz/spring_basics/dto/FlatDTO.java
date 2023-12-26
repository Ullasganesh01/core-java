package com.xworkz.spring_basics.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FlatDTO {
    @Value("1")
    private int flatID;
    @Value("2")
    private int floorNo;

    @Override
    public String toString() {
        return "FlatDTO{" +
                "flatID=" + flatID +
                ", floorNo=" + floorNo +
                '}';
    }
}

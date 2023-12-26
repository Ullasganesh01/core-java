package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class StateDTO {
    @Value("1")
    int stateId;
    @Value("Karnataka")
    String stateName;
    @Value("Bangalore")
    String cityName;
    @Value("54")
    int noOfDistrict;
}

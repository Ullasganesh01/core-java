package com.xworkz.spring_basics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Component
public class AddressDto {
    @Value("1")
    private int addressId;
    @Value("#540")
    private String doorNo;
    @Value("KCHS")
    private String areaName;
    @Value("Bengaluru")
    private String city;
    @Value("Karnataka")
    private String state;
    @Value("India")
    private String country;
}

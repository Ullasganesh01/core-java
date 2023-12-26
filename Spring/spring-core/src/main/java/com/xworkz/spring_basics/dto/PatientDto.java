package com.xworkz.spring_basics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Component
public class PatientDto {
    @Value("1")
    private int id;
    @Value("Ullas")
    private String name;
    @Value("22")
    private int age;
    @Autowired
    private AddressDto address;
}

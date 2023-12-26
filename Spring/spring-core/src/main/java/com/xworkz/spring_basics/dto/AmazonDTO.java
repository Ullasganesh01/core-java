package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AmazonDTO {
    @Value("1")
    int id;
    @Value("ULLAS")
    String firstName;
    @Value("BENGALURU")
    String location;
    @Autowired
    ProductDTO productDTO;
}

package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class CountryDTO {
    @Value("1")
    int countryId;
    @Value("INDIA")
    String countryName;
    @Value("30")
    int noOfState;
    @Autowired
    StateDTO stateDTO;
}

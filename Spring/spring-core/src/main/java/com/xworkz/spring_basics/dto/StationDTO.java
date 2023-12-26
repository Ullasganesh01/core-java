package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class StationDTO {
    @Value("1")
    int stationId;
    @Value("YESHWANTHPUR")
    String stationName;

}

package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MetroDTO {

    int metroId;

    String metroLine;

    int ticketPrice;

    StationDTO stationDTO;

    @Autowired
    public MetroDTO(@Value("1") int metroId,@Value("GREEN") String metroLine,@Value("30") int ticketPrice, StationDTO stationDTO) {
        this.metroId = metroId;
        this.metroLine = metroLine;
        this.ticketPrice = ticketPrice;
        this.stationDTO = stationDTO;
    }
}

package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("hotel")
public class HotelDTO {

    int hotelId;

    String hotelName;

    String location;

    MenuDTO menuDTO;

    @Autowired
    public HotelDTO(@Value("1") int hotelId,@Value("KFG") String hotelName,@Value("BEL ROAD") String location, MenuDTO menuDTO) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
        this.menuDTO = menuDTO;
    }
}

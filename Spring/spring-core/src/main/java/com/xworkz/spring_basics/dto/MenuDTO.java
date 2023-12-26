package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class MenuDTO {
    @Value("1")
    int menuId;
    @Value("FRENCH FRIES")
    String foodName;
    @Value("90")
    int price;
}

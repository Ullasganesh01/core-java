package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ShopDTO {
    @Value("1")
    private int shopId;
    @Value("LANDMARK")
    private String shopName;
    @Value("GAMES SHOP")
    private String typeOfShop;
}

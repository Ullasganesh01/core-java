package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProductDTO {
    @Value("1")
    int productId;
    @Value("IPHONE")
    String productName;
    @Value("50000")
    int price;
}

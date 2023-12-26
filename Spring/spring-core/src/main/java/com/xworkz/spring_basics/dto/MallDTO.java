package com.xworkz.spring_basics.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MallDTO {

    private int mallId;

    private String mallName;

    private String location;

    private ShopDTO shopDTO;

    @Autowired
    public MallDTO(@Value("1") int mallId,@Value("ORION") String mallName,@Value("YESHWANTHPUR") String location, ShopDTO shopDTO) {
        this.mallId = mallId;
        this.mallName = mallName;
        this.location = location;
        this.shopDTO = shopDTO;
    }
}

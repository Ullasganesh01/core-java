package com.xworkz.bms_app.reference_nouse;
//Just for data types -- not for real
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Entity
//@Table(name = "products1")
@Builder
public class ProductDto {

    @Id
    //@GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private double price;

//    @Column(name = "category")
//    @Enumerated(EnumType.STRING)
//    private Category category;

//    @Column(name = "brand")
//    private String brand;

//    @Column(name = "mfg_date")
//    private LocalDate mfgDate;

    @Column(name = "quantity")
    private int quantity;

}

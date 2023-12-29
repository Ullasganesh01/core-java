package com.xworkz.amazon_app.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "products")
@NamedQueries({
        @NamedQuery(name = "getAllProducts" , query = "from ProductDto dto")
})
public class ProductDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank
    private String productName;

    @NotNull
    @NotBlank
    private String productType;

    @NotNull
    @NotBlank
    private String manufacturedBy;

    @NotNull
    private double price;

    @NotNull
    private int stock;
}

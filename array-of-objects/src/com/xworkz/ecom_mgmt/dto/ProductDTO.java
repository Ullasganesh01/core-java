package com.xworkz.ecom_mgmt.dto;

import com.xworkz.ecom_mgmt.constants.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductDTO {
    private int productId;
    private String productName;
    private ProductType type;

    private GroceryCategory groceryCategory;
    private ElectronicsCategory electronicsCategory;
    private FashionCategory fashionCategory;
    private AppliancesCategory appliancesCategory;
    private FurnitureCategory furnitureCategory;
    private ToysCategory toysCategory;

    private AppliancesBrand appliancesBrand;
    private ElectronicsBrand electronicsBrand;
    private FashionBrand fashionBrand;
    private FurnitureBrand furnitureBrand;
    private GroceryBrand groceryBrand;
    private ToysBrand toysBrand;

    private double price;
    private int quantity;
    private LocalDate manufactureDate;

    @Override
    public String toString() {
        if (groceryCategory != null){
            return "ProductDTO{" +
                    "id : " + productId +
                    ", productName : '" + productName + '\'' +
                    ", type : " + type +
                    ", category : " + groceryCategory +
                    ", brand : " + groceryBrand +
                    ", price : " + price +
                    ", quantity : " + quantity +
                    ", manufactureDate : " + manufactureDate +
                    '}';
        }else if(electronicsCategory != null){
            return "ProductDTO{" +
                    "id : " + productId +
                    ", productName : '" + productName + '\'' +
                    ", type : " + type +
                    ", category : " + electronicsCategory +
                    ", brand : " + electronicsBrand +
                    ", price : " + price +
                    ", quantity : " + quantity +
                    ", manufactureDate : " + manufactureDate +
                    '}';
        } else if(fashionCategory != null){
            return "ProductDTO{" +
                    "id : " + productId +
                    ", productName : '" + productName + '\'' +
                    ", type : " + type +
                    ", category : " + fashionCategory +
                    ", brand : " + fashionBrand +
                    ", price : " + price +
                    ", quantity : " + quantity +
                    ", manufactureDate : " + manufactureDate +
                    '}';
        } else if(appliancesCategory != null){
            return "ProductDTO{" +
                    "id : " + productId +
                    ", productName : '" + productName + '\'' +
                    ", type : " + type +
                    ", category : " + appliancesCategory +
                    ", brand : " + appliancesBrand +
                    ", price : " + price +
                    ", quantity : " + quantity +
                    ", manufactureDate : " + manufactureDate +
                    '}';
        } else if (toysCategory != null){
            return "ProductDTO{" +
                    "id : " + productId +
                    ", productName : '" + productName + '\'' +
                    ", type : " + type +
                    ", category : " + toysCategory +
                    ", brand : " + toysBrand +
                    ", price : " + price +
                    ", quantity : " + quantity +
                    ", manufactureDate : " + manufactureDate +
                    '}';
        }else {
            return "ProductDTO{" +
                    "id : " + productId +
                    ", productName : '" + productName + '\'' +
                    ", type : " + type +
                    ", category : " + furnitureCategory +
                    ", brand : " + furnitureBrand +
                    ", price : " + price +
                    ", quantity : " + quantity +
                    ", manufactureDate : " + manufactureDate +
                    '}';
        }
    }

}

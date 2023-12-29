package com.xworkz.amazon_app.service;

import com.xworkz.amazon_app.dto.ProductDto;

import java.util.List;

public interface AmazonService {
    boolean validateAndAddProduct(ProductDto dto);
    List<ProductDto> validateAndGetAllProducts();
    ProductDto validateAndGetProductById(int id);
    boolean validateAndRemoveProduct(int id);
    boolean validateAndModifyProduct(ProductDto dto);
}

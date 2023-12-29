package com.xworkz.amazon_app.repository;

import com.xworkz.amazon_app.dto.ProductDto;

import java.util.List;

public interface AmazonRepository {
    boolean addProduct(ProductDto dto);
    List<ProductDto> getAllProducts();
    ProductDto getProductById(int id);
    boolean removeProduct(int id);
    boolean modifyProduct(ProductDto dto);
}

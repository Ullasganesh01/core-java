package com.xworkz.amazon_app.service.impl;

import com.xworkz.amazon_app.dto.ProductDto;
import com.xworkz.amazon_app.repository.AmazonRepository;
import com.xworkz.amazon_app.service.AmazonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmazonServiceImpl implements AmazonService {

    @Autowired
    private AmazonRepository amazonRepository;

    public boolean validateProduct(ProductDto dto){
        if (!dto.getProductName().isEmpty() && !dto.getProductType().isEmpty() && !dto.getManufacturedBy().isEmpty() && dto.getPrice()>0 && dto.getStock()>0){
            return true;
        }
        return false;
    }
    public boolean validateAndAddProduct(ProductDto dto) {
        if (dto!=null){
            if (validateProduct(dto)){
                return amazonRepository.addProduct(dto);
            }
        }
        return false;
    }

    @Override
    public List<ProductDto> validateAndGetAllProducts() {
        List<ProductDto> productList = amazonRepository.getAllProducts();
        if (productList!=null && !productList.isEmpty()){
            return productList;
        }
        return null;
    }

    @Override
    public ProductDto validateAndGetProductById(int id) {
        if (id>0){
            return amazonRepository.getProductById(id);
        }
        return null;
    }

    @Override
    public boolean validateAndRemoveProduct(int id) {
        if (id>0){
            return amazonRepository.removeProduct(id);
        }
        return false;
    }

    @Override
    public boolean validateAndModifyProduct(ProductDto dto) {
        if (dto!=null){
            if (validateProduct(dto)){
                return amazonRepository.modifyProduct(dto);
            }
        }
        return false;
    }
}

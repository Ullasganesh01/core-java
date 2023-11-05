package com.xworkz.instamart.imart;


import com.xworkz.instamart.dto.ProductDto;

public interface Instamart {
    ProductDto readProductDetails();
    void saveProduct(ProductDto dto);
    void getResults(int id);
    void save(ProductDto dto);
    void saveOrUpdate(ProductDto dto,int id);
    void persist(ProductDto dto);
    void update(ProductDto dto,int id);
    void merge(ProductDto dto,int id);
    void delete(int i);
    ProductDto get(int i);
    ProductDto load(int i);
    void moreQueries();
    void namedParameterQueries(int id);
    void criteriaQueries();
    void projectionQueries();
}

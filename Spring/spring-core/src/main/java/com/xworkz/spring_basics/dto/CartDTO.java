package com.xworkz.spring_basics.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CartDTO {

    private int cartID;

    private int noOfItems;

    public CartDTO(@Value("1") int cartID,@Value("10") int noOfItems) {
        this.cartID = cartID;
        this.noOfItems = noOfItems;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "cartID=" + cartID +
                ", noOfItems=" + noOfItems +
                '}';
    }
}

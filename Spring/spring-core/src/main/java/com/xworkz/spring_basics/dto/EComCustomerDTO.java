package com.xworkz.spring_basics.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ecom")
public class EComCustomerDTO {

    private int custID;

    private String customerName;

    private CartDTO cart;

    @Autowired
    public EComCustomerDTO(@Value("1") int custID,@Value("Sharan") String customerName, CartDTO cart) {
        this.custID = custID;
        this.customerName = customerName;
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "EComCustomerDTO{" +
                "custID=" + custID +
                ", customerName='" + customerName + '\'' +
                ", cart=" + cart +
                '}';
    }
}

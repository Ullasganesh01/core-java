package com.xworkz.ecommerce;


import com.xworkz.ecommerce.dto.CustomerDTO;
import com.xworkz.ecommerce.ecom.ECommerce;
import com.xworkz.ecommerce.ecom.impl.MyntraImpl;

import java.sql.SQLException;

public class EcommerceTester {
    public static void main(String[] args) throws SQLException {
        //Scanner s = new Scanner(System.in);
        ECommerce e = new MyntraImpl();
        CustomerDTO c = null;
        System.out.println(e.addCustomer(c));
        //e.getProducts();
        //e.getCustomers();
        //System.out.println(e);

    }
}

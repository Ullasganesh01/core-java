package com.xworkz.jdbc_connection.ecommerce;


import com.xworkz.jdbc_connection.ecommerce.dto.CustomerDTO;
import com.xworkz.jdbc_connection.ecommerce.ecom.ECommerce;
import com.xworkz.jdbc_connection.ecommerce.ecom.impl.MyntraImpl;

import java.sql.SQLException;
import java.util.Scanner;

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

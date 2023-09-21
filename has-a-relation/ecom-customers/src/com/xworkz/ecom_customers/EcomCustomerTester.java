package com.xworkz.ecom_customers;

import com.xworkz.ecom_customers.customer.Customer;
import com.xworkz.ecom_customers.ecom.Ecom;

public class EcomCustomerTester {
    public static void main(String[] args) {
        Ecom ecom = new Ecom();
        Customer customer = new Customer();
        ecom.customer = customer;
    }
}

package com.xworkz.ecom_mgmt;

import com.xworkz.ecom_mgmt.ecom.ECommerce;
import com.xworkz.ecom_mgmt.impl.FlipKartImpl;

import java.util.Scanner;

public class EcomTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the E-Commerce Website name");
        ECommerce e = new FlipKartImpl(s.next());
        //e.getProducts();
        //e.getCustomers();
        //System.out.println(e);
        e.options();
    }
}

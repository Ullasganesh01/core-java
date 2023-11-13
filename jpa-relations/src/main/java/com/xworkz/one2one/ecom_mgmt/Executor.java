package com.xworkz.one2one.ecom_mgmt;

import com.xworkz.one2one.ecom_mgmt.dto.CartDto;
import com.xworkz.one2one.ecom_mgmt.dto.UserDto;

import com.xworkz.one2one.ecom_mgmt.service.EcomService;
import com.xworkz.one2one.ecom_mgmt.service.impl.EcomServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EcomService ecomService = new EcomServiceImpl();
        while (true){
            System.out.println();
            System.out.println("Welcome to Ecommerce");
            System.out.println("1.To add product to cart");
            System.out.println("2.To fetch user by Id");
            System.out.println("3.To fetch cart by Id");
            System.out.println();
            System.out.println("Enter the choice : ");
            int choice = s.nextInt();
            if (choice>0 && choice <4){
                int id;
                String userName;
                String firstName;
                String lastName;
                long mobileNo;
                String address;
                String emailId;
                String password;
                Date createdAt;
                Date modifiedAt;

                long productId;
                int quantity;
                UserDto userDto;
                CartDto cartDto;
                switch (choice){
                    case 1:
                        s.nextLine();
                        System.out.println("Enter the product Id :");
                        productId = s.nextLong();
                        System.out.println("Enter the quantity :");
                        quantity = s.nextInt();
                        System.out.println("Enter the User Details :");
                        System.out.println("Enter the unique user name :");
                        userName = s.next();
                        System.out.println("Enter first name :");
                        firstName = s.next();
                        System.out.println("Enter last name :");
                        lastName = s.next();
                        System.out.println("Enter mobile number :");
                        mobileNo = s.nextLong();
                        System.out.println("Enter the address :");
                        address = s.next();
                        System.out.println("Enter the email id :");
                        emailId = s.next();
                        System.out.println("Enter the password :");
                        password = s.next();

                        userDto = UserDto.builder().
                                userName(userName).
                                firstName(firstName).
                                lastName(lastName).
                                mobileNo(mobileNo).
                                address(address).
                                emailId(emailId).
                                password(password).
                                createdAt(new Date()).
                                modifiedAt(new Date())
                                .build();

                        System.out.println(userDto);
                        cartDto = CartDto.builder()
                                .productId(productId)
                                .quantity(quantity)
                                .userDto(userDto)
                                .createdAt(new Date())
                                .modifiedAt(new Date()).build();
                        System.out.println(cartDto);

                        ecomService.validateCartDataAndSave(cartDto);
                        break;
                    case 2:
                        System.out.println("Enter the User id");
                        id = s.nextInt();
                        ecomService.validateFetchUserById(id);
                        break;
                    case 3:
                        System.out.println("Enter the Cart id");
                        id = s.nextInt();
                        ecomService.validateFetchCartById(id);
                        break;
                    default:
                        System.out.println("Enter the proper choice ");
                }
            }else {
                break;
            }
        }
    }
}

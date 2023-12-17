package com.xworkz.one2one.ecom_mgmt.repository;

import com.xworkz.one2one.ecom_mgmt.dto.CartDto;
import com.xworkz.one2one.ecom_mgmt.dto.UserDto;

public interface EcomRepository {
   //void addUser(UserDto dto);
   void addCart(CartDto dto);
   UserDto fetchUserById(int id);
   CartDto fetchCartById(int id);
}

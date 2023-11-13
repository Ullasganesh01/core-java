package com.xworkz.one2one.ecom_mgmt.service;

import com.xworkz.one2one.ecom_mgmt.dto.CartDto;
import com.xworkz.one2one.ecom_mgmt.dto.UserDto;

public interface EcomService {
    boolean validateUserDataAndSave(UserDto dto);
    void validateCartDataAndSave(CartDto dto);
    void validateFetchUserById(int id);
    void validateFetchCartById(int id);
}

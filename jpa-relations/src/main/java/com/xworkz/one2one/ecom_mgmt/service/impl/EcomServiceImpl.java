package com.xworkz.one2one.ecom_mgmt.service.impl;

import com.xworkz.one2one.ecom_mgmt.dto.CartDto;
import com.xworkz.one2one.ecom_mgmt.dto.UserDto;
import com.xworkz.one2one.ecom_mgmt.repository.EcomRepository;
import com.xworkz.one2one.ecom_mgmt.repository.impl.EcomRepositoryImpl;
import com.xworkz.one2one.ecom_mgmt.service.EcomService;

public class EcomServiceImpl implements EcomService {
    EcomRepository ecomRepository;

    public EcomServiceImpl(){
        ecomRepository = new EcomRepositoryImpl();
    }

    @Override
    public boolean validateUserDataAndSave(UserDto dto) {
        if (dto!=null){
            boolean isUserNameValidated = false;
            boolean isFirstNameValidated = false;
            boolean isLastNameValidated = false;
            boolean isMobileNoValidated = false;
            boolean isAddressValidated = false;
            boolean isEmailIdValidated =  false;
            boolean isPasswordValidated = false;
            if (dto.getUserName() != null && !dto.getUserName().isEmpty()){
                isUserNameValidated = true;
                System.out.println("Validated username");
            }
            if (dto.getFirstName()!= null && !dto.getFirstName().isEmpty()){
                isFirstNameValidated = true;
                System.out.println("Validated firstName");
            }
            if (dto.getLastName() != null && !dto.getLastName().isEmpty()){
                isLastNameValidated = true;
                System.out.println("Validated lastName");
            }
            if (dto.getMobileNo() > 1000000000 ){
                isMobileNoValidated = true;
                System.out.println("Validated mobileNo");
            }
            if (dto.getAddress() != null && !dto.getAddress().isEmpty()){
                isAddressValidated = true;
                System.out.println("Validated address");
            }
            if (dto.getPassword() != null && !dto.getAddress().isEmpty()){
                isPasswordValidated = true;
                System.out.println("Validated password");
            }
            if (dto.getEmailId() != null && !dto.getEmailId().isEmpty()){
                isEmailIdValidated = true;
                System.out.println("Validated emailid");
            }
            if (isUserNameValidated && isFirstNameValidated && isLastNameValidated && isMobileNoValidated && isAddressValidated && isEmailIdValidated && isPasswordValidated){
                //ecomRepository.addUser(dto);
                System.out.println("Validated user data");
                return true;
            }
            else {
                System.out.println("Invalid data has been entered");
                return false;
            }
        }else {
            System.out.println("Data is null");
            return false;
        }
    }

    @Override
    public void validateCartDataAndSave(CartDto dto) {
        if (dto!=null){
            boolean isProductIdValidated = false;
            boolean isQuantityValidated = false;
            boolean isUserValidated = false;
            if (dto.getProductId()>0){
                isProductIdValidated = true;
                System.out.println("Validated product id");
            }
            if (dto.getQuantity()>0){
                isQuantityValidated = true;
                System.out.println("Validated quantity");
            }
            if (dto.getUserDto()!=null){
                isUserValidated = validateUserDataAndSave(dto.getUserDto());
            }
            if (isProductIdValidated&&isQuantityValidated&&isUserValidated){
                ecomRepository.addCart(dto);
            }else {
                System.out.println("Invalid data has been entered");
            }
        }else {
            System.out.println("Data is null");
        }
    }

    @Override
    public void validateFetchUserById(int id) {
        if (id>0){
            System.out.println(ecomRepository.fetchUserById(id));
        }else {
            System.out.println("Invalid Data entered");
        }
    }

    @Override
    public void validateFetchCartById(int id) {
        if (id>0){
            System.out.println(ecomRepository.fetchCartById(id));
        }else {
            System.out.println("Invalid Data entered");
        }
    }
}

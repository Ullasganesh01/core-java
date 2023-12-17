package com.xworkz.showroom.service;

import com.xworkz.showroom.dto.UserDto;

import java.util.List;

public interface UserService {
    boolean validateAndRegisterUser(UserDto dto);
    boolean validateAndLoginUser(String uName,String password);
    List<UserDto> validateAndGetAllUsers();
    UserDto validateAndGetUserById(int id);
    boolean validateAndUpdateUserById(int id,UserDto dto);
    boolean validateAndDeleteUserById(int id);
}

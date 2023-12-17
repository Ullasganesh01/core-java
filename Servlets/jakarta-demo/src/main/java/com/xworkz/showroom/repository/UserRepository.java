package com.xworkz.showroom.repository;

import com.xworkz.showroom.dto.UserDto;

import java.util.List;

public interface UserRepository {
    boolean registerNewUser(UserDto dto);
    List<UserDto> loginUser(String uName, String password);
    List<UserDto> getAllUsers();
    UserDto getUserById(int id);
    boolean updateUserById(int id,UserDto dto);
    boolean deleteUserById(int id);
}

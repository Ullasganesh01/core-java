package com.xworkz.user_details.repository;

import com.xworkz.user_details.dto.UserDto;

public interface UserRepository {
    void addNewUser(UserDto dto);
}

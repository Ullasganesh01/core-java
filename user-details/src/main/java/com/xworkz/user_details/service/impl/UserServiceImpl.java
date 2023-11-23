package com.xworkz.user_details.service.impl;

import com.xworkz.user_details.dto.UserDto;
import com.xworkz.user_details.repository.UserRepository;
import com.xworkz.user_details.repository.impl.UserRepositoryImpl;
import com.xworkz.user_details.service.UserService;

public class UserServiceImpl implements UserService {
    UserRepository repository = new UserRepositoryImpl();
    public String validateAddNewUser(UserDto dto) {
        repository.addNewUser(dto);
        return dto.toString();
    }
}

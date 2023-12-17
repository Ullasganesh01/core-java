package com.xworkz.showroom.service.impl;

import com.xworkz.showroom.dto.UserDto;
import com.xworkz.showroom.repository.UserRepository;
import com.xworkz.showroom.repository.impl.UserRepositoryImpl;
import com.xworkz.showroom.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserRepository repository = new UserRepositoryImpl();
    @Override
    public boolean validateAndRegisterUser(UserDto dto) {
        if (dto!=null){
            if(!dto.getName().equals("") && dto.getAge()>0 && dto.getPNumber()>1000000000 && !dto.getUName().equals("") && !dto.getPassword().equals("")){
                if(repository.registerNewUser(dto)){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public boolean validateAndLoginUser(String uName, String password) {
        if (!uName.equals("") && !password.equals("")){
            List<UserDto> dtos = repository.loginUser(uName,password);
            if (dtos!=null && !dtos.isEmpty()){
                UserDto dto = dtos.get(0);
                if(dto.getUName().equals(uName) && dto.getPassword().equals(password)){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public List<UserDto> validateAndGetAllUsers() {
        List<UserDto> users = repository.getAllUsers();
        if (users!=null){
            return users;
        }
        return null;
    }

    @Override
    public UserDto validateAndGetUserById(int id) {
        if (id>0){
            UserDto dto = repository.getUserById(id);
            if (dto!=null){
                return dto;
            }
        }
        return null;
    }

    @Override
    public boolean validateAndUpdateUserById(int id, UserDto dto) {
        if (dto!=null){
            if(!dto.getName().equals("") && dto.getAge()>0 && dto.getPNumber()>1000000000 && !dto.getUName().equals("") && !dto.getPassword().equals("")){
                if(repository.updateUserById(id,dto)){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public boolean validateAndDeleteUserById(int id) {
        if(id>0){
            if (repository.deleteUserById(id)){
                return true;
            }
        }
        return false;
    }
}

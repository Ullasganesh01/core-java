package com.xworkz.passport_app.service.impl;


import com.xworkz.passport_app.dto.PassportDto;
import com.xworkz.passport_app.repository.PassportRepository;
import com.xworkz.passport_app.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportServiceImpl implements PassportService {
    @Autowired
    private PassportRepository repository;

    public String validatePassportDto(PassportDto dto){
        if (dto!=null){
            if (dto.getCpvLocation()!=null && !(dto.getCpvLocation().isEmpty())){
                if (dto.getPassportOfficeLoc()!=null && !(dto.getPassportOfficeLoc().isEmpty())){
                    if (dto.getFirstName()!=null && !(dto.getFirstName().isEmpty())){
                        if (dto.getDob()!=null && !(dto.getDob().equals(""))){
                            if (dto.getEmail()!=null && !(dto.getEmail().isEmpty())){
                                if (dto.getLoginId()!=null && !(dto.getLoginId().isEmpty())){
                                    if (dto.getPassword()!=null && !(dto.getPassword().isEmpty())){
                                        if (dto.getConfirmPwd()!=null && !dto.getConfirmPwd().isEmpty()){
                                            if (dto.getPassword().equals(dto.getConfirmPwd())){
                                                if (dto.getHintQuestion()!=null && !dto.getHintQuestion().isEmpty()){
                                                    if (dto.getHintAnswer()!=null && !dto.getHintAnswer().isEmpty()){
                                                        return "true";
                                                    }else {
                                                        return "Hint answer is empty";
                                                    }
                                                }else {
                                                    return "Hint Question is empty";
                                                }
                                            }else {
                                                return "Password and Confirm Password Doesn't match";
                                            }
                                        }else {
                                            return "Confirm password is empty";
                                        }
                                    }else {
                                        return "Password is empty";
                                    }
                                }else {
                                    return "Login Id is empty";
                                }
                            }else {
                                return "Email is empty";
                            }
                        }else {
                            return "Date of birth is empty";
                        }
                    }else {
                        return "First name is empty";
                    }
                }else {
                    return "Passport Office Location is empty";
                }
            }else {
                return "CPV Location field is empty.";
            }
        }else {
            return "Detail Object Is Null";
        }
    }

    public boolean validateAddNewPassportDetails(PassportDto dto) {
        String validateMsg = validatePassportDto(dto);
        if (validateMsg.equals("true")){
            return repository.addNewPassportDetails(dto);
        }else {
            System.out.println(validateMsg);
            return false;
        }
    }

    @Override
    public boolean validateAndLoginUser(String loginId, String password) {
        if (!loginId.equals("") && !password.equals("")){
            List<PassportDto> dtos = repository.loginUser(loginId,password);
            if (dtos!=null && !dtos.isEmpty()){
                PassportDto dto = dtos.get(0);
                if(dto.getLoginId().equals(loginId) && dto.getPassword().equals(password)){
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
    public List<PassportDto> validateGetAllPassportDetails() {
        return repository.getAllPassports();
    }

    @Override
    public boolean validateAndDeletePassportById(int id) {
        if (id > 0) {
            if (repository.deletePassport(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PassportDto validateAndGetPassportById(int id) {
        if (id > 0) {
            PassportDto dto = repository.getPassportById(id);
            if (dto != null) {
                return dto;
            }
        }
        return null;
    }

    @Override
    public boolean validateAndUpdatePassport(PassportDto dto) {
        if (dto != null) {
            if (validatePassportDto(dto).equals("true")){
                return repository.updatePassport(dto);
            }
            System.out.println(validatePassportDto(dto));
            return false;
        }
        return false;
    }


    @Override
    public List<PassportDto> validateAndFilter(String firstName, String email) {
        if (!firstName.isEmpty() && !email.isEmpty()){
            return repository.filterPassportsByFirstNameAndEmail(firstName,email);
        }else if (!firstName.isEmpty()){
            return repository.filterPassportsByFirstName(firstName);
        } else if (!email.isEmpty()) {
            return repository.filterPassportsByEmail(email);
        }
        return null;
    }
}

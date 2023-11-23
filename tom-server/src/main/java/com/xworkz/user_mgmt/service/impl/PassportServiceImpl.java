package com.xworkz.user_mgmt.service.impl;

import com.xworkz.user_mgmt.dto.PassportDto;
import com.xworkz.user_mgmt.repository.PassportRepository;
import com.xworkz.user_mgmt.repository.impl.PassportRepositoryImpl;
import com.xworkz.user_mgmt.service.PassportService;

public class PassportServiceImpl implements PassportService {
    private static PassportRepository repository = new PassportRepositoryImpl();
    public String validateAddNewUserPassportDetails(PassportDto dto) {
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
                                                        repository.addNewUserPassportDetails(dto);
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
}

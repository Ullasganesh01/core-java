package com.xworkz.passport_app.service;

import com.xworkz.passport_app.dto.PassportDto;

import java.util.List;

public interface PassportService {
    boolean validateAddNewPassportDetails(PassportDto dto);

    List<PassportDto> validateGetAllPassportDetails();

    boolean validateAndDeletePassportById(int id);

    PassportDto validateAndGetPassportById(int id);

    boolean validateAndUpdatePassport(PassportDto dto);

    boolean validateAndLoginUser(String loginId, String password);
}

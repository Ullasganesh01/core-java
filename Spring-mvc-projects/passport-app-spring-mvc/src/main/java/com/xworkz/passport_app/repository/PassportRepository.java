package com.xworkz.passport_app.repository;

import com.xworkz.passport_app.dto.PassportDto;

import java.util.List;

public interface PassportRepository {
    boolean addNewPassportDetails(PassportDto dto);
    List<PassportDto> getAllPassports();
    boolean deletePassport(int id);
    PassportDto getPassportById(int id);
    boolean updatePassport(PassportDto dto);
    List loginUser(String loginId, String password);
}

package com.xworkz.user_mgmt.repository;

import com.xworkz.user_mgmt.dto.PassportDto;

public interface PassportRepository {
    void addNewUserPassportDetails(PassportDto dto);
}

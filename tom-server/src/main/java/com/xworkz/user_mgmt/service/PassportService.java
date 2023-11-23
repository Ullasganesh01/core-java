package com.xworkz.user_mgmt.service;

import com.xworkz.user_mgmt.dto.PassportDto;

public interface PassportService {
    String validateAddNewUserPassportDetails(PassportDto dto);
}

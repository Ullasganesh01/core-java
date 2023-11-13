package com.xworkz.mobile.service;

import com.xworkz.mobile.dto.MobileDto;

public interface MobileService {
    void validateCreateMobile(MobileDto dto);
    void validateFetchMobileById(int id);
    void validateFetchBatteryById(int id);
}

package com.xworkz.mobile.repository;

import com.xworkz.mobile.dto.BatteryDto;
import com.xworkz.mobile.dto.MobileDto;

public interface MobileRepository {
    void createMobile(MobileDto dto);
    MobileDto fetchMobileById(int id);
    BatteryDto fetchBatteryById(int id);
}

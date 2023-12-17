package com.xworkz.mobile.service.impl;

import com.xworkz.mobile.dto.BatteryDto;
import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.repository.MobileRepository;
import com.xworkz.mobile.repository.impl.MobileRepositoryImpl;
import com.xworkz.mobile.service.MobileService;

public class MobileServiceImpl implements MobileService {
    private static MobileRepository mobileRepository = new MobileRepositoryImpl();
    @Override
    public void validateCreateMobile(MobileDto dto) {
        if (dto!=null){
            if (dto.getMName()!=null && dto.getStorage()!=null && dto.getRam()!=null && dto.getBattery()!=null){
                BatteryDto batteryDto = dto.getBattery();
                if (batteryDto.getCapacity()>0 && batteryDto.getBName()!=null){
                    mobileRepository.createMobile(dto);
                }
            }
            else {
                System.out.println("Invalid data has been entered");
            }
        }else {
            System.out.println("Mobile is null");
        }
    }

    @Override
    public void validateFetchMobileById(int id) {
        if (id>0){
            System.out.println(mobileRepository.fetchMobileById(id));
        }else {
            System.out.println("Invalid id");
        }
    }

    @Override
    public void validateFetchBatteryById(int id) {
        if (id>0){
            System.out.println(mobileRepository.fetchBatteryById(id));
        }else {
            System.out.println("Invalid id");
        }
    }
}

package com.xworkz.hospital.service.impl;

import com.xworkz.hospital.dto.AddressDto;
import com.xworkz.hospital.dto.PatientDto;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.repository.impl.HospitalRepositoryImpl;
import com.xworkz.hospital.service.HospitalService;

public class HospitalServiceImpl implements HospitalService {
    private static HospitalRepository hospitalRepository = new HospitalRepositoryImpl();
    @Override
    public void validateAddPatient(PatientDto dto) {
        if (dto!=null){
            if (dto.getPName()!=null && dto.getMobileNo()>0 && dto.getAddress()!=null){
                AddressDto addressDto = dto.getAddress();
                if (addressDto.getStreet()!=null && addressDto.getArea()!=null && addressDto.getCity()!=null && addressDto.getPinCode()>0){
                    hospitalRepository.addPatient(dto);
                }
            }else {
                System.out.println("Invalid details has been entered");
            }
        }else {
            System.out.println("Patient is null");
        }
    }

    @Override
    public void validateGetPatientById(int id) {
        if (id>0){
            System.out.println(hospitalRepository.getPatientById(id));
        }else {
            System.out.println("Invalid id");
        }
    }

    @Override
    public void validateGetAddressById(int id) {
        if (id>0){
            System.out.println(hospitalRepository.getAddressById(id));
        }else {
            System.out.println("Invalid id");
        }
    }
}

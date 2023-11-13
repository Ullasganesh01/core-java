package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.AddressDto;
import com.xworkz.hospital.dto.PatientDto;

public interface HospitalRepository {
    void addPatient(PatientDto dto);
    PatientDto getPatientById(int id);
    AddressDto getAddressById(int id);
}

package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.PatientDto;

public interface HospitalService {
    void validateAddPatient(PatientDto dto);
    void validateGetPatientById(int id);
    void validateGetAddressById(int id);
}

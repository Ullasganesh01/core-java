package com.xworkz.collections_crud_operations.hospital_mgmt.compartor;

import com.xworkz.collections_crud_operations.hospital_mgmt.dto.PatientDTO;

import java.util.Comparator;

public class PatientContactNoComparator implements Comparator<PatientDTO> {
    @Override
    public int compare(PatientDTO o1, PatientDTO o2) {
        return (int) (o1.getContactNo()- o2.getContactNo());
    }
}

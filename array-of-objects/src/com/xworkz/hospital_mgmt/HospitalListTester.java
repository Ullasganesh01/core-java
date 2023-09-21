package com.xworkz.hospital_mgmt;

import com.xworkz.hospital_mgmt.constants.BloodGroup;
import com.xworkz.hospital_mgmt.constants.Gender;
import com.xworkz.hospital_mgmt.constants.WardNumber;
import com.xworkz.hospital_mgmt.dto.PatientDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HospitalListTester {
    public static void main(String[] args) {
        List<PatientDTO> patients = new ArrayList<>();
        patients.add(new PatientDTO(2,"ullas", BloodGroup.APOS,21, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas"));
        patients.add(new PatientDTO(1,"tejas", BloodGroup.APOS,21, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas"));
        patients.add(new PatientDTO(4,"gagan", BloodGroup.APOS,21, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas"));
        patients.add(new PatientDTO(3,"sharan", BloodGroup.APOS,21, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas"));
        patients.add(new PatientDTO(5,"pavan", BloodGroup.APOS,21, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas"));
        System.out.println(patients);
        Collections.sort(patients);
        System.out.println(patients);

    }
}

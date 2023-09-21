package com.xworkz.hospital_patient;

import com.xworkz.hospital_patient.hospital.Hospital;
import com.xworkz.hospital_patient.patient.Patient;

public class HospitalPatientTester {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Patient patient = new Patient();
        hospital.patient = patient;
    }
}

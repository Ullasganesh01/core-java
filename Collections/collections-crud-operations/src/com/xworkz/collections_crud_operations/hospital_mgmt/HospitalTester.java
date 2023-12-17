package com.xworkz.collections_crud_operations.hospital_mgmt;

import com.xworkz.collections_crud_operations.hospital_mgmt.constants.BloodGroup;
import com.xworkz.collections_crud_operations.hospital_mgmt.constants.Gender;
import com.xworkz.collections_crud_operations.hospital_mgmt.constants.WardNumber;
import com.xworkz.collections_crud_operations.hospital_mgmt.dto.PatientDTO;
import com.xworkz.collections_crud_operations.hospital_mgmt.hospital.Hospital;

import java.util.Scanner;

public class HospitalTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        PatientDTO p1 = new PatientDTO();
        p1.setPatientId(1);
        p1.setPatientName("tejas");
        p1.setGender(Gender.MALE);
        p1.setAge(22);
        p1.setAddress("basaveshwar nagar");
        p1.setBloodGroup(BloodGroup.OPOS);
        p1.setContactNo(9113613239L);
        p1.setAttenderName("sharan");
        p1.setDiseaseName("back Pain");
        p1.setConsultantName("pavan");
        p1.setHospitalName("manipal");
        p1.setFees(2500.30);
        p1.setWardNo(WardNumber.A2);

        PatientDTO p2 = new PatientDTO();
        p2.setPatientId(2);
        p2.setPatientName("sharan");
        p2.setGender(Gender.MALE);
        p2.setAge(23);
        p2.setAddress("yeshwantpur");
        p2.setBloodGroup(BloodGroup.APOS);
        p2.setContactNo(9123658924L);
        p2.setAttenderName("ullas");
        p2.setDiseaseName("migraine");
        p2.setConsultantName("pranam");
        p2.setHospitalName("esi");
        p2.setFees(1200.90);
        p2.setWardNo(WardNumber.B3);

        PatientDTO p3 = new PatientDTO();
        p3.setPatientId(3);
        p3.setPatientName("ullas");
        p3.setGender(Gender.MALE);
        p3.setAge(22);
        p3.setAddress("kengeri");
        p3.setBloodGroup(BloodGroup.ABNEG);
        p3.setContactNo(8904603732L);
        p3.setAttenderName("tejas");
        p3.setDiseaseName("leg Pain");
        p3.setConsultantName("vignesh");
        p3.setHospitalName("Apollo");
        p3.setFees(1658.78);
        p3.setWardNo(WardNumber.C4);

        PatientDTO p4 = new PatientDTO();
        p4.setPatientId(1);
        p4.setPatientName("tejas");
        p4.setGender(Gender.MALE);
        p4.setAge(22);
        p4.setAddress("basaveshwar nagar");
        p4.setBloodGroup(BloodGroup.OPOS);
        p4.setContactNo(9113613239L);
        p4.setAttenderName("sharan");
        p4.setDiseaseName("back Pain");
        p4.setConsultantName("pavan");
        p4.setHospitalName("manipal");
        p4.setFees(2500.30);
        p4.setWardNo(WardNumber.A2);
*/
        //PatientDTO p5 = null;


        //System.out.println(p1.equals(p4));

        /*
        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(p2);
        System.out.println(p2.hashCode());
        System.out.println(p3);
        System.out.println(p3.hashCode());

*/
        //System.out.println("Enter the Hospital Name : ");
        //Hospital hospital = new Hospital(sc.next().toLowerCase());
        //hospital.createPatient(p1);
       // hospital.createPatient(p2);
       // hospital.createPatient(p3);
        //hospital.createPatient(p4);
        //hospital.createPatient(p5);
       // hospital.createPatient(p2);
       // hospital.createPatient(p3);
        //hospital.getPatients();
        //hospital.hospitalOptions();
        //Hospital h1 = new Hospital(2);
       // hospital1.createPatient(p3);
       // hospital1.getPatients();

       // PatientDTO p6 = new PatientDTO();
        //p6.providePatientDetails();


        //PatientDTO p7 = new PatientDTO();
       // h1.providePatientDetails(p6);
        //h1.providePatientDetails(p7);
        //h1.getPatients();

        //Hospital h2 = new Hospital(1);
        //h2.createPatient(p7);
        //PatientDTO p8 = new PatientDTO();
        //h2.providePatientDetails(p8);
        //h2.getPatients();

        System.out.println("Enter the Hospital Name : ");
        Hospital hospital = new Hospital(sc.next().toLowerCase());
        hospital.hospitalOptions();
    }
}

package com.xworkz.hospital;

import com.xworkz.hospital.dto.AddressDto;
import com.xworkz.hospital.dto.PatientDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.impl.HospitalServiceImpl;
import com.xworkz.hospital.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class HospitalExecutor {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        Scanner s = new Scanner(System.in);
        HospitalService hospitalService = new HospitalServiceImpl();
        while (true){
            System.out.println();
            System.out.println("Welcome to the Hospital");
            System.out.println("1.To add new Patient");
            System.out.println("2.To fetch patient by Id");
            System.out.println("3.To fetch address city by Id");
            System.out.println();
            System.out.println("Enter the choice : ");
            int choice = s.nextInt();
            if (choice>0 && choice <4){
                int pId;
                String pName;
                long mobileNo;

                AddressDto addressDto;
                PatientDto patientDto;

                int addressId;
                String street;
                String area;
                String city;
                int pinCode;

                switch (choice){
                    case 1:
                        System.out.println("Enter patient name :");
                        pName = s.next();
                        System.out.println("Enter mobile number :");
                        mobileNo = s.nextLong();
                        System.out.println("Enter the Address");
                        System.out.println("Enter street :");
                        street = s.next();
                        System.out.println("Enter area:");
                        area = s.next();
                        System.out.println("Enter city :");
                        city = s.next();
                        System.out.println("Enter pin-code :");
                        pinCode = s.nextInt();

                        addressDto = AddressDto.builder()
                                .street(street)
                                .area(area)
                                .city(city)
                                .pinCode(pinCode)
                                .build();
em.getTransaction().begin();
em.persist(addressDto);

                        patientDto = PatientDto.builder()
                                .pName(pName)
                                .mobileNo(mobileNo)
                                .address(addressDto)
                                .build();
em.persist(patientDto);
em.getTransaction().commit();
                        //hospitalService.validateAddPatient(patientDto);
                        break;
                    case 2:
                        System.out.println("Enter the patient id");
                        pId = s.nextInt();
                        hospitalService.validateGetPatientById(pId);
                        break;
                    case 3:
                        System.out.println("Enter the address id");
                        addressId = s.nextInt();
                        hospitalService.validateGetAddressById(addressId);
                        break;
                    default:
                        System.out.println("Enter the proper choice ");
                }
            }else {
                break;
            }
        }
    }
}

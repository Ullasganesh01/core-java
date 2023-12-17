package com.xworkz.passport;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.dto.PersonDto;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.impl.PassportServiceImpl;
import com.xworkz.passport.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class PassportTester {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        Scanner s = new Scanner(System.in);
        PassportService passportService = new PassportServiceImpl();
        while (true){
            System.out.println();
            System.out.println("Welcome to the Passport office");
            System.out.println("1.To save person");
            System.out.println("2.To get person by Id");
            System.out.println("3.To get passport by Id");
            System.out.println();
            System.out.println("Enter the choice : ");
            int choice = s.nextInt();
            if (choice>0 && choice <4){
                int pId;
                String pName;
                long mobileNo;
                int age;

                PassportDto passportDto;
                PersonDto personDto;

                int passId;
                String pHolderName;
                String nationality;
                String address;

                switch (choice){
                    case 1:
                        System.out.println("Enter person name :");
                        pName = s.next();
                        System.out.println("Enter mobile number :");
                        mobileNo = s.nextLong();
                        System.out.println("Enter age :");
                        age = s.nextInt();
                        System.out.println("Enter the Passport details");
                        System.out.println("Enter passport holder name :");
                        pHolderName = s.next();
                        System.out.println("Enter nationality :");
                        nationality = s.next();
                        System.out.println("Enter the address");
                        address = s.next();

                        passportDto = PassportDto.builder()
                                .pHolderName(pHolderName)
                                .nationality(nationality)
                                .address(address)
                                .build();

                        em.getTransaction().begin();
                        //em.persist(passportDto);

                        personDto = PersonDto.builder()
                                .pName(pName)
                                .mobileNo(mobileNo)
                                .age(age)
                                .passport(passportDto)
                                .build();

                        em.persist(personDto);
                        em.getTransaction().commit();
                        //passportService.validateAndSavePerson(personDto);
                        break;
                    case 2:
                        System.out.println("Enter the person id");
                        pId = s.nextInt();
                        passportService.validateGetPersonById(pId);
                        break;
                    case 3:
                        System.out.println("Enter the passport id");
                        passId = s.nextInt();
                        passportService.validateGetPassportById(passId);
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

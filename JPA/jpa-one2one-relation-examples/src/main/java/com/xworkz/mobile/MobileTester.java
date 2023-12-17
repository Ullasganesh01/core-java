package com.xworkz.mobile;

import com.xworkz.mobile.dto.BatteryDto;
import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.impl.MobileServiceImpl;
import com.xworkz.mobile.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class MobileTester {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        Scanner s = new Scanner(System.in);
        MobileService mobileService = new MobileServiceImpl();
        while (true){
            System.out.println();
            System.out.println("Welcome to the Mobile Shop");
            System.out.println("1.To create new mobile");
            System.out.println("2.To get mobile by Id");
            System.out.println("3.To get battery by Id");
            System.out.println();
            System.out.println("Enter the choice : ");
            int choice = s.nextInt();
            if (choice>0 && choice <4){
                int mId;
                String mName;
                String storage;
                String ram;

                MobileDto mobileDto;
                BatteryDto batteryDto;

                int bId;
                int capacity;
                String bName;

                switch (choice){
                    case 1:
                        System.out.println("Enter mobile name :");
                        mName = s.next();
                        System.out.println("Enter mobile storage :");
                        storage = s.next();
                        System.out.println("Enter mobile RAM :");
                        ram = s.next();
                        System.out.println("Enter the Battery details");
                        System.out.println("Enter capacity :");
                        capacity = s.nextInt();
                        System.out.println("Enter battery name :");
                        bName = s.next();

                        batteryDto = BatteryDto.builder()
                                .capacity(capacity)
                                .bName(bName)
                                .build();
em.getTransaction().begin();
//em.persist(batteryDto);
                        mobileDto = MobileDto.builder()
                                .mName(mName)
                                .storage(storage)
                                .ram(ram)
                                .battery(batteryDto)
                                .build();
em.persist(mobileDto);
em.getTransaction().commit();
                        //mobileService.validateCreateMobile(mobileDto);
                        break;
                    case 2:
                        System.out.println("Enter the mobile id");
                        mId = s.nextInt();
                        mobileService.validateFetchMobileById(mId);
                        break;
                    case 3:
                        System.out.println("Enter the battery id");
                        bId = s.nextInt();
                        mobileService.validateFetchBatteryById(bId);
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

package com.xworkz.country;

import com.xworkz.country.dto.CapitalCityDto;
import com.xworkz.country.dto.StateDto;
import com.xworkz.country.service.CountryService;
import com.xworkz.country.service.impl.CountryServiceImpl;
import com.xworkz.country.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class CountryTester {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        Scanner s = new Scanner(System.in);
        CountryService countryService = new CountryServiceImpl();
        while (true){
            System.out.println();
            System.out.println("Welcome to the Country");
            System.out.println("1.To save new State");
            System.out.println("2.To fetch state by Id");
            System.out.println("3.To fetch capital city by Id");
            System.out.println();
            System.out.println("Enter the choice : ");
            int choice = s.nextInt();
            if (choice>0 && choice <4){
                int stateId;
                String state;
                String country;
                String continent;

                int cityId;
                String capitalCity;
                String language;

                CapitalCityDto capitalCityDto;
                StateDto stateDto;
                switch (choice){
                    case 1:
                        System.out.println("Enter state :");
                        state = s.next();
                        System.out.println("Enter country :");
                        country = s.next();
                        System.out.println("Enter continent :");
                        continent = s.next();
                        System.out.println("Enter the city details:");
                        System.out.println("Enter capital city :");
                        capitalCity = s.next();
                        System.out.println("Enter language :");
                        language = s.next();

                        capitalCityDto = CapitalCityDto.builder()
                                .capitalCity(capitalCity)
                                .language(language)
                                .build();

                        em.getTransaction().begin();
                        em.persist(capitalCityDto);



                        stateDto = StateDto.builder()
                                .state(state)
                                .country(country)
                                .continent(continent)
                                .capitalCity(capitalCityDto)
                                .build();

                        em.persist(stateDto);
                        em.getTransaction().commit();
                       // countryService.validateSaveState(stateDto);
                        break;
                    case 2:
                        System.out.println("Enter the state id");
                        stateId = s.nextInt();
                        countryService.validateGetStateDetailsById(stateId);
                        break;
                    case 3:
                        System.out.println("Enter the city id");
                        cityId = s.nextInt();
                        countryService.validateGetCapitalCityById(cityId);
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

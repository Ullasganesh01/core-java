package com.xworkz.country;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.StatesDto;
import com.xworkz.country.repository.CountryRepository;
import com.xworkz.country.repository.impl.CountryRepositoryImpl;
import com.xworkz.country.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class CountryExecutor {
    public static void main(String[] args) {
        CountryRepository countryRepository = new CountryRepositoryImpl();
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();


        StatesDto statesDto = new StatesDto();
        statesDto.setName("karnataka");
        statesDto.setLanguage("kannada");
        statesDto.setCapital("bengaluru");

        StatesDto statesDto1 = new StatesDto();
        statesDto1.setName("maharashtra");
        statesDto1.setLanguage("marathi");
        statesDto1.setCapital("mumbai");

        List<StatesDto> statesList = new ArrayList<>();
        statesList.add(statesDto);
        statesList.add(statesDto1);

        CountryDto countryDto = new CountryDto();
        countryDto.setCountry("India");
        countryDto.setContinent("asia");
        countryDto.setCode("IN");
        countryDto.setStates(statesList);

        statesDto.setCountry(countryDto);
        statesDto1.setCountry(countryDto);

        em.getTransaction().begin();
        em.persist(statesDto);
        em.persist(statesDto1);
        em.persist(countryDto);
        em.getTransaction().commit();

        //countryRepository.addCountry(countryDto);
    }
}

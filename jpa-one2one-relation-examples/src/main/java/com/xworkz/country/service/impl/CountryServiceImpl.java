package com.xworkz.country.service.impl;

import com.xworkz.country.dto.CapitalCityDto;
import com.xworkz.country.dto.StateDto;
import com.xworkz.country.repository.CountryRepository;
import com.xworkz.country.repository.impl.CountryRepositoryImpl;
import com.xworkz.country.service.CountryService;

public class CountryServiceImpl implements CountryService {
    private static CountryRepository countryRepository = new CountryRepositoryImpl();
    @Override
    public void validateSaveState(StateDto dto) {
        if (dto!=null){
            if (dto.getState()!=null && dto.getCountry()!=null && dto.getContinent()!=null & dto.getCapitalCity()!=null){
                CapitalCityDto cityDto = dto.getCapitalCity();
                if (cityDto.getCapitalCity()!=null && cityDto.getLanguage()!=null){
                    countryRepository.saveState(dto);
                }
            }else {
                System.out.println("Invalid details");
            }
        }else {
            System.out.println("State is null");
        }
    }

    @Override
    public void validateGetStateDetailsById(int id) {
        if (id>0){
            System.out.println(countryRepository.getStateDetailsById(id));
        }else {
            System.out.println("Invalid Id");
        }
    }

    @Override
    public void validateGetCapitalCityById(int id) {
        if (id>0){
            System.out.println(countryRepository.getCapitalCityById(id));
        }else {
            System.out.println("Invalid Id");
        }
    }
}

package com.xworkz.country.repository;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.StatesDto;

public interface CountryRepository {
    void addCountry(CountryDto dto);
    CountryDto getCountryById(int id);
    StatesDto getStatesById(int id);
}

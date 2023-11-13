package com.xworkz.country.repository;

import com.xworkz.country.dto.CapitalCityDto;
import com.xworkz.country.dto.StateDto;

public interface CountryRepository {
    void saveState(StateDto dto);
    StateDto getStateDetailsById(int id);
    CapitalCityDto getCapitalCityById(int id);
}

package com.xworkz.country.service;

import com.xworkz.country.dto.StateDto;

public interface CountryService {
    void validateSaveState(StateDto dto);
    void validateGetStateDetailsById(int id);
    void validateGetCapitalCityById(int id);
}

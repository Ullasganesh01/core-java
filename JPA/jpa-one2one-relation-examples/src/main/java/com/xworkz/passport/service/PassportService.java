package com.xworkz.passport.service;

import com.xworkz.passport.dto.PersonDto;

public interface PassportService {
    void validateAndSavePerson(PersonDto dto);
    void validateGetPersonById(int id);
    void validateGetPassportById(int id);
}

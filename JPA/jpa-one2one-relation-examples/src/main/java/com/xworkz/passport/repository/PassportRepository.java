package com.xworkz.passport.repository;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.dto.PersonDto;

public interface PassportRepository {
    void savePerson(PersonDto dto);
    PersonDto getPersonById(int id);
    PassportDto getPassportById(int id);
}

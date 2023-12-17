package com.xworkz.passport.service.impl;

import com.xworkz.passport.dto.PersonDto;
import com.xworkz.passport.repository.PassportRepository;
import com.xworkz.passport.repository.impl.PassportRepositoryImpl;
import com.xworkz.passport.service.PassportService;

public class PassportServiceImpl implements PassportService {
    private static PassportRepository passportRepository = new PassportRepositoryImpl();
    @Override
    public void validateAndSavePerson(PersonDto dto) {
        if (dto!=null){
            if (dto.getPName()!=null && dto.getMobileNo()>0 && dto.getAge()>0 && dto.getPassport()!=null){
                if (dto.getPassport().getPHolderName()!=null && dto.getPassport().getAddress()!=null && dto.getPassport().getNationality()!=null){
                    passportRepository.savePerson(dto);
                }
            }else {
                System.out.println("Details are not entered properly");
            }
        }else {
            System.out.println("Person details is null");
        }
    }

    @Override
    public void validateGetPersonById(int id) {
        if (id>0){
            System.out.println(passportRepository.getPersonById(id));
        }
    }

    @Override
    public void validateGetPassportById(int id) {
        if (id>0){
            System.out.println(passportRepository.getPassportById(id));
        }
    }
}

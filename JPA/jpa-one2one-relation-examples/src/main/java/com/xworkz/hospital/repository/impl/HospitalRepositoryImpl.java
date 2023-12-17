package com.xworkz.hospital.repository.impl;

import com.xworkz.hospital.dto.AddressDto;
import com.xworkz.hospital.dto.PatientDto;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class HospitalRepositoryImpl implements HospitalRepository {
    EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void addPatient(PatientDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
    }

    @Override
    public PatientDto getPatientById(int id) {
        return em.find(PatientDto.class,id);
    }

    @Override
    public AddressDto getAddressById(int id) {
        return em.find(AddressDto.class,id);
    }
}

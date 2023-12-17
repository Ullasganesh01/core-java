package com.xworkz.bank.repository.impl;

import com.xworkz.bank.dto.ATMCardDto;
import com.xworkz.bank.dto.AccountDto;
import com.xworkz.bank.repository.BankRepository;
import com.xworkz.bank.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class BankRepositoryImpl implements BankRepository {
    EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public void createAccount(AccountDto dto) {
        em.getTransaction().begin();
        em.persist(dto);
        em.getTransaction().commit();
        System.out.println("Created Successfully");
    }

    @Override
    public AccountDto getAccountDetailsById(int id) {
        return em.find(AccountDto.class,id);
    }

    @Override
    public ATMCardDto getATMCardDetailsById(int id) {
        return em.find(ATMCardDto.class,id);
    }
}

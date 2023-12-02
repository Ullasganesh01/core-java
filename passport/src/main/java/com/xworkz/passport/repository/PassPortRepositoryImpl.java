package com.xworkz.passport.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassPortEntity;

public class PassPortRepositoryImpl implements PassPortRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean onSave(PassportDto dto) {
		System.out.println("save method Running");
		// convert or Map Dto to Entity



		PassportDto entity = new PassportDto();
		entity.setName(dto.getName());
		entity.setEmailId(dto.getEmailId());
		entity.setPhoneNo(dto.getPhoneNo());
		entity.setPassword(dto.getPassword());
		entity.setDate(dto.getDate());
		entity.setConfirmPassword(dto.getConfirmPassword());
		entity.setOfficeLocation(dto.getOfficeLocation());
		entity.setPanNumber(dto.getPanNumber());
		entity.setAadharNumber(dto.getAadharNumber());

		System.out.println("this is entity data:" + entity);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		return true;
	}

}

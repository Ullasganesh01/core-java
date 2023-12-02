package com.xworkz.hireact.runner;

import com.xworkz.hireact.dto.HireactDTO;
import com.xworkz.hireact.service.HireactService;
import com.xworkz.hireact.service.HireactServiceImp;

public class HireactRunner {

	public static void main(String... args) throws Exception{
		HireactDTO dto = new HireactDTO();
		dto.setId(7);
		dto.setName("abc");
		dto.setQualification("be");
		dto.setSkills("css");
		dto.setEmail("nikhilgmail.com");
		
		HireactService service = new HireactServiceImp();
		service.validateAndSave(dto);
		service.update(dto, 2);
		service.readByID(2);
		service.deleteByName("abc");
	}

}

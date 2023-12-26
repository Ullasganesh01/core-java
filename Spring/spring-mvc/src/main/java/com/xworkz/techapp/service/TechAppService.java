package com.xworkz.techapp.service;

import com.xworkz.techapp.dto.TechnologyDto;

import java.util.List;

public interface TechAppService {
    boolean validateAndSaveTechnology(TechnologyDto technologyDto);

    List<TechnologyDto> getAllTechnologies();

    boolean validateAndDeleteById(int id);

    TechnologyDto validateGetTechById(int id);

    boolean validateUpdateTech(TechnologyDto dto);
}

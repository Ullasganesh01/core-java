package com.xworkz.techapp.service.impl;

import com.xworkz.techapp.dto.TechnologyDto;
import com.xworkz.techapp.repository.TechAppRepository;
import com.xworkz.techapp.service.TechAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechAppServiceImpl implements TechAppService {
    @Autowired
    private TechAppRepository repository;

    public boolean validateAndSaveTechnology(TechnologyDto dto) {
        if (dto != null) {
            if (!dto.getTechnologyName().isEmpty() && !dto.getVersion().isEmpty() && !dto.getReleasedYear().isEmpty() && !dto.getOwnedOrganization().isEmpty()) {
                repository.save(dto);
                return true;
            }
            return false;
        }
        return false;
    }

    public List<TechnologyDto> getAllTechnologies() {
        return repository.getAllTechnologies();
    }

    @Override
    public boolean validateAndDeleteById(int id) {
        if (id > 0) {
            if (repository.delete(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public TechnologyDto validateGetTechById(int id) {
        if (id > 0) {
            TechnologyDto dto = repository.getTechById(id);
            if (dto != null) {
                return dto;
            }
        }
        return null;
    }

    @Override
    public boolean validateUpdateTech(TechnologyDto dto) {
        if (dto != null) {
            if (!dto.getTechnologyName().isEmpty() && !dto.getVersion().isEmpty() && !dto.getReleasedYear().isEmpty() && !dto.getOwnedOrganization().isEmpty()) {
                repository.updateTech(dto);
                return true;
            }
            return false;
        }
        return false;
    }
}
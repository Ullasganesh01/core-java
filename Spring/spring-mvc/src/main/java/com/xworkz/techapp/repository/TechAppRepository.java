package com.xworkz.techapp.repository;

import com.xworkz.techapp.dto.TechnologyDto;

import java.util.List;

public interface TechAppRepository{
    boolean save(TechnologyDto dto);
    List<TechnologyDto> getAllTechnologies();
    boolean delete(int id);
    TechnologyDto getTechById(int id);
    boolean updateTech(TechnologyDto dto);
}

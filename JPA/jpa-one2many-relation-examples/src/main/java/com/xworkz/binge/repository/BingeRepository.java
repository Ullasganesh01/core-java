package com.xworkz.binge.repository;

import com.xworkz.binge.dto.BingeDto;
import com.xworkz.binge.dto.OttDto;

public interface BingeRepository {
    void saveBinge(BingeDto dto);
    BingeDto getBingeById(int id);
    OttDto getOttById(int id);
}

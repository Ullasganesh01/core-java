package com.xworkz.multiplex.repository;

import com.xworkz.multiplex.dto.MultiplexDto;
import com.xworkz.multiplex.dto.ScreensDto;

public interface MultiplexRepository {
    void addMultiplex(MultiplexDto dto);
    MultiplexDto getMultiplexById(int id);
    ScreensDto getScreenById(int id);
}

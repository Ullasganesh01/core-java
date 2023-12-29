package com.xworkz.bike_showroom.repository;

import com.xworkz.bike_showroom.dto.BikeDto;

import java.util.List;

public interface BikeShowroomRepository {
    boolean addBike(BikeDto dto);
    List<BikeDto> getAllBikes();
    BikeDto getBikeById(int id);
    boolean removeBike(int id);
    boolean modifyBike(BikeDto dto);
}

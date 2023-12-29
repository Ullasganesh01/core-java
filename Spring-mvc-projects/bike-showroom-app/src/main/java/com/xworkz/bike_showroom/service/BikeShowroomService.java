package com.xworkz.bike_showroom.service;

import com.xworkz.bike_showroom.dto.BikeDto;

import java.util.List;

public interface BikeShowroomService {
    boolean validateAndAddBike(BikeDto dto);
    List<BikeDto> validateAndGetAllBikes();
    BikeDto validateAndGetBikeById(int id);
    boolean validateAndRemoveBike(int id);
    boolean validateAndModifyBike(BikeDto dto);
}

package com.xworkz.bike_showroom.service.impl;

import com.xworkz.bike_showroom.dto.BikeDto;
import com.xworkz.bike_showroom.repository.BikeShowroomRepository;
import com.xworkz.bike_showroom.service.BikeShowroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeShowroomServiceImpl implements BikeShowroomService {
    @Autowired
    private BikeShowroomRepository bikeShowroomRepository;

    public boolean validateBikeDto(BikeDto dto){
        if (!dto.getBikeName().isEmpty() && !dto.getEngineCC().isEmpty() && !dto.getColor().isEmpty() && !dto.getBikeType().isEmpty() && !dto.getCompany().isEmpty() && dto.getGears()>0 && dto.getExShowroomPrice()>0){
            return true;
        }
        return false;
    }

    public boolean validateAndAddBike(BikeDto dto) {
        if (dto!=null){
            if(validateBikeDto(dto)){
                return bikeShowroomRepository.addBike(dto);
            }
        }
        return false;
    }

    public List<BikeDto> validateAndGetAllBikes() {
        List<BikeDto> bikeList = bikeShowroomRepository.getAllBikes();
        if (bikeList!=null && !bikeList.isEmpty()){
            return bikeList;
        }
        return null;
    }

    public BikeDto validateAndGetBikeById(int id) {
        if (id>0){
            return bikeShowroomRepository.getBikeById(id);
        }
        return null;
    }

    public boolean validateAndRemoveBike(int id) {
        if (id>0){
            return bikeShowroomRepository.removeBike(id);
        }
        return false;
    }

    public boolean validateAndModifyBike(BikeDto dto) {
        if (dto!=null){
            if (validateBikeDto(dto)){
                return bikeShowroomRepository.modifyBike(dto);
            }
        }
        return false;
    }
}

package com.xworkz.bike_showroom.controller;

import com.xworkz.bike_showroom.dto.BikeDto;
import com.xworkz.bike_showroom.service.BikeShowroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class BikeShowroomController {
    @Autowired
    private BikeShowroomService bikeShowroomService;

    @PostMapping("addBike")
    public String addBike(@Valid BikeDto dto, BindingResult errors, Model model){
        if (errors.hasErrors()){
            List<ObjectError> errorsList = errors.getAllErrors();
            model.addAttribute("errors",errorsList);
            return "error";
        }
        if (dto!=null){
            if (bikeShowroomService.validateAndAddBike(dto)){
                model.addAttribute("addedMessage","Added : "+dto.getBikeName()+" Successfully!");
                return "index";
            }
        }
        return "error";
    }

    @GetMapping("getBikes")
    public String getAllBikes(Model model){
        List<BikeDto> bikeList = bikeShowroomService.validateAndGetAllBikes();
        if (bikeList!=null && !bikeList.isEmpty()){
            model.addAttribute("bikes",bikeList);
            return "showroom";
        }
        model.addAttribute("getBikesError","No Bikes Found");
        return "error";
    }

    @GetMapping("getAndModify")
    public String getBikeById(@RequestParam int bikeId,Model model){
        BikeDto dto = bikeShowroomService.validateAndGetBikeById(bikeId);
        if (dto!=null){
            model.addAttribute("bike",dto);
            return "modifyBikePage";
        }
        model.addAttribute("getAndModifyError","No Bike Found");
        return "error";
    }

    @PostMapping("modifyBike")
    public String modifyBike(@Valid BikeDto dto,BindingResult errors,Model model){
        System.out.println("Bike to be updated :" +dto);
        if (errors.hasErrors()){
            List<ObjectError> errorsList = errors.getAllErrors();
            model.addAttribute("errors",errorsList);
            return "error";
        }
        if (dto!=null){
            if (bikeShowroomService.validateAndModifyBike(dto)){
                model.addAttribute("modifyMessage","Modified : "+dto.getBikeName()+" Successfully!");
                return getAllBikes(model);
            }
        }
        return "error";
    }

    @GetMapping("remove")
    public String removeBike(@RequestParam int bikeId,Model model){
        if (bikeShowroomService.validateAndRemoveBike(bikeId)){
            model.addAttribute("removeBikeMessage","Removed Bike with Id : " +bikeId+" Successfully!!");
            return getAllBikes(model);
        }
        model.addAttribute("removeBikeError","No Bike Found");
        return "error";
    }
}

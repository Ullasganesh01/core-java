package com.xworkz.techapp.controller;

import com.xworkz.techapp.dto.TechnologyDto;
import com.xworkz.techapp.service.TechAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class TechAppController {

    @Autowired
    private TechAppService service;

    @PostMapping("saveTechnology")
    String saveTechnology(@ModelAttribute @Valid TechnologyDto technologyDto, BindingResult errors, Model model){
        System.out.println(errors.hasErrors());
        if (errors.hasErrors()){
            List<ObjectError> listErrors = errors.getAllErrors();
            model.addAttribute("errors",listErrors);
            for (ObjectError listError : listErrors){
                System.out.println(listError.getDefaultMessage());
            }
            return "index";
        }
        if (technologyDto!=null){
            service.validateAndSaveTechnology(technologyDto);
            model.addAttribute("addedMessage",technologyDto.getTechnologyName()+" added!!");
            return "index";
        }
        return "error";
    }


    @GetMapping("getAllTech")
    String getAllTechnologies(Model model){
        List techList = service.getAllTechnologies();
        if(!techList.isEmpty()){
            model.addAttribute("techs",techList);
            System.out.println(techList);
            return "techlist";
        }
        return "error";
    }

    @GetMapping("delete")
    String deleteTechById(@RequestParam  int techId,Model model){
        if (service.validateAndDeleteById(techId)){
            model.addAttribute("deletedMessage","Tech with Id : " +techId +" Deleted successfully!!");
            return getAllTechnologies(model);
        }
        return "error";
    }

    @GetMapping("update")
    String getUpdateTech(@RequestParam int techId,Model model){
        TechnologyDto dto = service.validateGetTechById(techId);
        if (dto!=null){
            model.addAttribute("tech",dto);
            return "updateTech";
        }
        return "error";
    }

    @PostMapping("updateTechnology")
    String updateTechnology(@ModelAttribute TechnologyDto technologyDto, Model model){
        if (technologyDto!=null){
            service.validateUpdateTech(technologyDto);
            model.addAttribute("updatedMessage","Tech : "+ technologyDto.getTechnologyName() +" updated successfully!!");
            return getAllTechnologies(model);
        }
        return "error";
    }
}

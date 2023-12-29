package com.xworkz.passport_app.controller;

import com.xworkz.passport_app.dto.PassportDto;
import com.xworkz.passport_app.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class PassportController {

    @Autowired
    private PassportService service;

    @PostMapping("addNewPassport")
    String addNewPassport(@ModelAttribute @Valid PassportDto dto, BindingResult errors, Model model){
        System.out.println(dto);
        System.out.println(errors.hasErrors());
        if (errors.hasErrors()){
            List<ObjectError> listErrors = errors.getAllErrors();
            model.addAttribute("errors",listErrors);
            for (ObjectError listError : listErrors){
                System.out.println(listError.getDefaultMessage());
            }
            return "index";
        }
        if (dto!=null){
            if(service.validateAddNewPassportDetails(dto)){
                return "login";
            }
          //  model.addAttribute("addedMessage",dto.getFirstName()+" added!!");
        }
        return "error";
    }

    @PostMapping("loginUser")
    String loginUser(@RequestBody MultiValueMap<String,String> req, Model model){
        String loginId = req.getFirst("loginId");
        String password =req.getFirst("password");
        if (service.validateAndLoginUser(loginId,password)){
            model.addAttribute("loginMsg","Login successful");
            return getAllPassports(model);
        }
        model.addAttribute("loginMsg","Login Unsuccessful");
        return "login";
    }


    @GetMapping("getAllPassports")
    String getAllPassports(Model model){
        List passports = service.validateGetAllPassportDetails();
        if(!passports.isEmpty()){
            model.addAttribute("passports",passports);
            System.out.println(passports);
            return "userpage";
        }
        return "error";
    }

    @GetMapping("delete")
    String deletePassportById(@RequestParam int passId, Model model){
        if (service.validateAndDeletePassportById(passId)){
            model.addAttribute("deletedMessage","Passport with Id : " +passId +" Deleted successfully!!");
            return getAllPassports(model);
        }
        return "error";
    }

    @GetMapping("update")
    String getPassportByIdForUpdate(@RequestParam int passId,Model model){
        PassportDto dto = service.validateAndGetPassportById(passId);
        if (dto!=null){
            model.addAttribute("passport",dto);
            return "updatePassport";
        }
        return "error";
    }

    @PostMapping("updatePassport")
    String updatePassport(@ModelAttribute @Valid PassportDto dto, Model model){
        if (dto!=null){
            System.out.println(dto);
            if(service.validateAndUpdatePassport(dto)){
                model.addAttribute("updatedMessage","Passport : "+ dto.getFirstName() +" updated successfully!!");
                return getAllPassports(model);
            }
        }
        return "error";
    }
}

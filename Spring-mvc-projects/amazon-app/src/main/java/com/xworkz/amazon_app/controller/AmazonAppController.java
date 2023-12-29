package com.xworkz.amazon_app.controller;

import com.xworkz.amazon_app.dto.ProductDto;
import com.xworkz.amazon_app.service.AmazonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//@RestController
@Controller
@RequestMapping("/")
public class AmazonAppController {

    @Autowired
    private AmazonService amazonService;

    @PostMapping("addProduct")
    //@ResponseBody
    public String addProduct(@Valid ProductDto dto, BindingResult errors, Model model){
        if (errors.hasErrors()){
            List<ObjectError> errorsList = errors.getAllErrors();
            model.addAttribute("errors",errorsList);
            return "error";
        }
        if (dto!=null){
            if(amazonService.validateAndAddProduct(dto)){
                model.addAttribute("addedMessage","Added : " + dto.getProductName() + " Successfully!!");
                return "index";
            }
        }
        model.addAttribute("addProductError","Could not add the product because of invalid data");
        return "error";
    }

    @GetMapping("getProducts")
    public String getAllProducts(Model model){
        List<ProductDto> productList = amazonService.validateAndGetAllProducts();
        if (productList!=null && !productList.isEmpty()){
            model.addAttribute("products",productList);
            return "product-list";
        }
        model.addAttribute("getProductsError","No Products Found");
        return "error";
    }

//    @GetMapping("getAndModify")
//    public String getProductById(@RequestParam int productId,Model model){
//        ProductDto dto = amazonService.validateAndGetProductById(productId);
//        if (dto!=null){
//            model.addAttribute("product",dto);
//            return "modifyProductPage";
//        }
//        model.addAttribute("getAndModifyError","No Product Found");
//        return "error";
//    }
// using path variable - change in get all in update url and update page url
    @GetMapping("getAndModify/{productId}")
    public String getProductById(@PathVariable int productId,Model model){
        ProductDto dto = amazonService.validateAndGetProductById(productId);
        if (dto!=null){
            model.addAttribute("product",dto);
            return "modifyProductPage";
        }
        model.addAttribute("getAndModifyError","No Product Found");
        return "error";
    }

    // using redirect
    @PostMapping("modifyProduct")
    public String modifyProduct(@Valid ProductDto dto,BindingResult errors,Model model){
        //System.out.println("Product to be updated :" +dto);
        if (errors.hasErrors()){
            List<ObjectError> errorsList = errors.getAllErrors();
            model.addAttribute("errors",errorsList);
            return "error";
        }
        if (dto!=null){
            if (amazonService.validateAndModifyProduct(dto)){
                model.addAttribute("modifyMessage","Modified : "+dto.getProductName()+" Successfully!");
                //return getAllProducts(model);
                return "redirect:getProducts";
            }
        }
        return "error";
    }
    
    // using redirect
    @GetMapping("remove")
    public String removeProduct(@RequestParam int productId,Model model){
        if (amazonService.validateAndRemoveProduct(productId)){
            model.addAttribute("removeProductMessage","Removed Product with Id : " +productId+" Successfully!!");
            //return getAllProducts(model);
            return "redirect:getProducts";
        }
        model.addAttribute("removeProductError","No Product Found");
        return "error";
    }

//    @GetMapping("remove/{productId}")
//    public String removeProduct(@PathVariable int productId,Model model){
//        if (amazonService.validateAndRemoveProduct(productId)){
//            model.addAttribute("removeProductMessage","Removed Product with Id : " +productId+" Successfully!!");
//            return getAllProducts(model);
//        }
//        model.addAttribute("removeProductError","No Product Found");
//        return "error";
//    }
}

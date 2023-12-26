package com.xworkz.spring_basics;

import com.xworkz.spring_basics.dto.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.xworkz.spring_basics");
        PatientDto patientDto = context.getBean(PatientDto.class);
        System.out.println(patientDto);

        AmazonDTO amazonDTO = context.getBean(AmazonDTO.class);
        System.out.println(amazonDTO);

        ApartmentDTO apartmentDTO = context.getBean(ApartmentDTO.class);
        System.out.println(apartmentDTO);

        ComputerDTO computerDTO = context.getBean(ComputerDTO.class);
        System.out.println(computerDTO);

        CountryDTO countryDTO  = context.getBean(CountryDTO.class);
        System.out.println(countryDTO);

        EComCustomerDTO eComCustomerDTO = context.getBean(EComCustomerDTO.class);
        System.out.println(eComCustomerDTO);

        GameDTO gameDTO = context.getBean(GameDTO.class);
        System.out.println(gameDTO);

        HotelDTO hotelDTO = context.getBean(HotelDTO.class);
        System.out.println(hotelDTO);

        MallDTO mallDTO = context.getBean(MallDTO.class);
        System.out.println(mallDTO);

        MetroDTO metroDTO = context.getBean(MetroDTO.class);
        System.out.println(metroDTO);

        ComputerDTO computerDTO1 = (ComputerDTO)context.getBean("mycomp");
        System.out.println(computerDTO1);

        GameDTO gameDTO1 = context.getBean(GameDTO.class);
        System.out.println(gameDTO1);

        EComCustomerDTO eComCustomerDTO1 = (EComCustomerDTO) context.getBean("ecom");
        System.out.println(eComCustomerDTO1);

        GameDTO gameDTO2 = (GameDTO) context.getBean("game");
        System.out.println(gameDTO2);

        HotelDTO hotelDTO1 = (HotelDTO) context.getBean("hotel");
        System.out.println(hotelDTO1);

        MallDTO mallDTO1 = context.getBean(MallDTO.class);
        System.out.println(mallDTO1);

        MetroDTO metroDTO1 = context.getBean(MetroDTO.class);
        System.out.println(metroDTO1);
    }
}

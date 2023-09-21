package com.xworkz.dto_examples_object_class_methods;

import com.xworkz.dto_examples_object_class_methods.constants.BloodGroup;
import com.xworkz.dto_examples_object_class_methods.constants.Gender;
import com.xworkz.dto_examples_object_class_methods.dto.BankDTO;
import com.xworkz.dto_examples_object_class_methods.dto.CustomerDTO;
import com.xworkz.dto_examples_object_class_methods.dto.HospitalDTO;
import com.xworkz.dto_examples_object_class_methods.dto.OrderDTO;
import com.xworkz.dto_examples_object_class_methods.dto.StudentDTO;

public class DtoTester {
    public static void main(String[] args) {
        BankDTO bankDTO = new BankDTO();
        //System.out.println(bankDTO);

        BankDTO bankDTO1 =new BankDTO(2151113,"Ullas","SBI");
        //System.out.println(bankDTO1);

        BankDTO bankDTO2 = new BankDTO(1566556,"Tejas","BOB");
        BankDTO bankDTO3 = new BankDTO(8484415,"Sharan","CBI");
        BankDTO bankDTO4 = new BankDTO(2151113,"Ullas","SBI");

        System.out.println(bankDTO3.equals(bankDTO2));
        System.out.println(bankDTO1.equals(bankDTO4));


        HospitalDTO hospitalDTO = new HospitalDTO("Ullas",21 , Gender.MALE, BloodGroup.A_Positive);
       // System.out.println(hospitalDTO);
        HospitalDTO hospitalDTO1 = new HospitalDTO("Tejas",11,Gender.MALE,BloodGroup.AB_Positive);
        HospitalDTO hospitalDTO2 = new HospitalDTO("Sharan",13,Gender.MALE,BloodGroup.O_Positive);
        HospitalDTO hospitalDTO3 = new HospitalDTO("Tejas",11,Gender.MALE,BloodGroup.AB_Positive);
        System.out.println(hospitalDTO);
        System.out.println(hospitalDTO1.equals(hospitalDTO3));
        System.out.println(hospitalDTO2.equals(hospitalDTO));


        CustomerDTO customerDTO = new CustomerDTO(29,"Ullas",51511611);
        //System.out.println(customerDTO);
        CustomerDTO customerDTO1 = new CustomerDTO(33,"Sharan",515151161);
        CustomerDTO customerDTO2 = new CustomerDTO(32,"Tejas",51984855);
        CustomerDTO customerDTO3 = new CustomerDTO(33,"Sharan",515151161);
        System.out.println(customerDTO3.equals(customerDTO1));
        System.out.println(customerDTO.equals(customerDTO2));

        OrderDTO orderDTO = new OrderDTO(18,"Mobile","Bengaluru");
        //System.out.println(orderDTO);
        OrderDTO orderDTO1 = new OrderDTO(19,"Brush","Ullal");
        OrderDTO orderDTO2 = new OrderDTO(20,"Earphones","Anekal");
        System.out.println(orderDTO.equals(orderDTO));
        System.out.println(orderDTO2.equals(orderDTO1));

        StudentDTO studentDTO = new StudentDTO(32,"Ullas",10);
        //System.out.println(studentDTO);
        StudentDTO studentDTO1 = new StudentDTO(29,"Gagan",8);
        StudentDTO studentDTO2 = new StudentDTO(33,"Pavan",6);
        StudentDTO studentDTO3 = new StudentDTO(35,"Ashwath",9);
        System.out.println(studentDTO1.equals(studentDTO3));
        System.out.println(studentDTO2.equals(studentDTO));

        System.out.println(orderDTO2.equals(studentDTO1));

        /* Object methods -- 
        toString();
        getClass();
        hashCode();
        3 wait() methods;
        notify();
        notifyAll();
        clone();
        finalize();
        equals();
         */

    }
}

package com.xworkz.collections_crud_operations.ecom_mgmt;

import com.xworkz.collections_crud_operations.ecom_mgmt.comparator.CustomerSortComparator;
import com.xworkz.collections_crud_operations.ecom_mgmt.constants.Gender;
import com.xworkz.collections_crud_operations.ecom_mgmt.dto.CustomerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EcomListTester {
    public static void main(String[] args) {
        List<CustomerDTO> customers = new ArrayList<>();
        customers.add(new CustomerDTO(2,"ullas", 8904603746L,"bengaluru","ullasganesh@gmail.com", Gender.MALE));
        customers.add(new CustomerDTO(1,"pavan", 1234567891L,"mandya","pavangowda@gmail.com", Gender.MALE));
        customers.add(new CustomerDTO(4,"tejas", 8941538222L,"hassan","tejasmc@gmail.com", Gender.MALE));
        customers.add(new CustomerDTO(3,"gagan", 9981323643L,"anekal","gagangowda@gmail.com", Gender.MALE));
        customers.add(new CustomerDTO(5,"sharan", 532864866L,"udupi","sharanselvam@gmail.com", Gender.MALE));

        System.out.println(customers);
        Collections.sort(customers);
        System.out.println(customers);

        CustomerSortComparator.sortCustomerNameAsc(customers);
        CustomerSortComparator.sortCustomerNameDesc(customers);
        CustomerSortComparator.sortCustomerAddressAsc(customers);
        CustomerSortComparator.sortCustomerAddressDesc(customers);
        CustomerSortComparator.sortCustomerEmailAsc(customers);
        CustomerSortComparator.sortCustomerEmailDesc(customers);
        CustomerSortComparator.sortCustomerPhoneNoAsc(customers);
        CustomerSortComparator.sortCustomerPhoneNoDesc(customers);
    }
}

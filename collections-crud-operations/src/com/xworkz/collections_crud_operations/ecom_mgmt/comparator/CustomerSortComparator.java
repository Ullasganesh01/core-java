package com.xworkz.collections_crud_operations.ecom_mgmt.comparator;

import com.xworkz.collections_crud_operations.ecom_mgmt.dto.CustomerDTO;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerSortComparator {
    public static void sortCustomerNameAsc(List<CustomerDTO> cus){
        System.out.println(cus.stream().sorted(Comparator.comparing(CustomerDTO::getCustomerName)).collect(Collectors.toList()));
    }

    public static void sortCustomerNameDesc(List<CustomerDTO> cus){
        System.out.println(cus.stream().sorted(Comparator.comparing(CustomerDTO::getCustomerName).reversed()).collect(Collectors.toList()));
    }

    public static void sortCustomerAddressAsc(List<CustomerDTO> cus){
        System.out.println(cus.stream().sorted(Comparator.comparing(CustomerDTO::getAddress)).collect(Collectors.toList()));
    }

    public static void sortCustomerAddressDesc(List<CustomerDTO> cus){
        System.out.println(cus.stream().sorted(Comparator.comparing(CustomerDTO::getAddress).reversed()).collect(Collectors.toList()));
    }

    public static void sortCustomerEmailAsc(List<CustomerDTO> cus){
        System.out.println(cus.stream().sorted(Comparator.comparing(CustomerDTO::getEmail)).collect(Collectors.toList()));
    }

    public static void sortCustomerEmailDesc(List<CustomerDTO> cus){
        System.out.println(cus.stream().sorted(Comparator.comparing(CustomerDTO::getEmail).reversed()).collect(Collectors.toList()));
    }

    public static void sortCustomerPhoneNoAsc(List<CustomerDTO> cus){
        System.out.println(cus.stream().sorted(Comparator.comparing(CustomerDTO::getPhoneNumber)).collect(Collectors.toList()));
    }

    public static void sortCustomerPhoneNoDesc(List<CustomerDTO> cus){
        System.out.println(cus.stream().sorted(Comparator.comparing(CustomerDTO::getPhoneNumber).reversed()).collect(Collectors.toList()));
    }
}

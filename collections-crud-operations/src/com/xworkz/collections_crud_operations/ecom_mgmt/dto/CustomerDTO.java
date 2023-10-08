package com.xworkz.collections_crud_operations.ecom_mgmt.dto;

import com.xworkz.collections_crud_operations.ecom_mgmt.constants.Gender;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO implements Comparable<CustomerDTO>{
    private int customerId;
    private String customerName;
    private long phoneNumber;
    private String address;
    private String email;
    private Gender gender;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId : " + customerId +
                ", customerName : '" + customerName + '\'' +
                ", phoneNumber : " + phoneNumber +
                ", address : '" + address + '\'' +
                ", email : '" + email + '\'' +
                ", gender : " + gender +
                '}' + "\n";
    }

    @Override
    public int compareTo(CustomerDTO o) {
        return this.customerId - o.customerId;
    }
}

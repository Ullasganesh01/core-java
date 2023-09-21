package com.xworkz.ecom_mgmt.dto;

import com.xworkz.ecom_mgmt.constants.Gender;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO {
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
                '}';
    }

}

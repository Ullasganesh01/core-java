package com.xworkz.jdbc_connection.ecommerce.dto;


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
    private String password;


    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId : " + customerId +
                ", customerName : '" + customerName + '\'' +
                ", phoneNumber : " + phoneNumber +
                ", address : '" + address + '\'' +
                ", email : '" + email + '\'' +
                ", password :" + password + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(CustomerDTO o) {
        return this.customerId - o.customerId;
    }
}

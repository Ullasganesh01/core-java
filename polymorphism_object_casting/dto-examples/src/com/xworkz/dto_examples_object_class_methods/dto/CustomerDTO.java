package com.xworkz.dto_examples_object_class_methods.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private int customerId;
    private String customerName;
    private long contactNumber;

    @Override
    public String toString() {
        return "CustomerDTO{" + "\n customerId : " + customerId + ", \n customerName : '" + customerName + '\'' + ",\n contactNumber : " + contactNumber + "\n}";
    }

    @Override
    public int hashCode() {
        return customerId;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof CustomerDTO){
            CustomerDTO customerDTO = (CustomerDTO) obj;
            if ((this.hashCode() == customerDTO.hashCode()) && (this.getCustomerName().equals(customerDTO.getCustomerName())) && (this.getContactNumber()==customerDTO.getContactNumber()))
                return true;
        }
        return false;
    }
}

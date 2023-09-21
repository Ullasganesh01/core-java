package com.xworkz.dto_examples_object_class_methods.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class OrderDTO {
    private int orderId;
    private String orderedItem;
    private String address;

    @Override
    public String toString() {
        return "OrderDTO(" + "orderId : " + orderId + ", orderedItem : " + orderedItem + ", address : " + address + ')';
    }

    @Override
    public int hashCode() {
        return orderId;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof OrderDTO){
            OrderDTO orderDTO = (OrderDTO) obj;
            if ((this.hashCode() == orderDTO.hashCode()) && (this.getOrderedItem().equals(orderDTO.getOrderedItem())) && (this.getAddress().equals(orderDTO.getAddress())))
                return true;
        }
        return false;
    }
}

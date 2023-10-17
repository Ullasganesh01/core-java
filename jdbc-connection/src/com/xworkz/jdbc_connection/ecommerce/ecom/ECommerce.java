package com.xworkz.jdbc_connection.ecommerce.ecom;

import com.xworkz.jdbc_connection.ecommerce.dto.CustomerDTO;

import java.sql.SQLException;

public interface ECommerce {

    /*void options();
    void addOptions();
    void getDetailsOptions();
    void updateOptions();
    void deleteOptions();

     */
    boolean addCustomer(CustomerDTO dto) throws SQLException;

}

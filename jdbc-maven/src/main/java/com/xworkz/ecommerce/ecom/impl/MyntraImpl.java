package com.xworkz.ecommerce.ecom.impl;


import com.xworkz.ecommerce.dto.CustomerDTO;
import com.xworkz.ecommerce.ecom.ECommerce;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class MyntraImpl implements ECommerce {
     
    @Override
    public boolean addCustomer(CustomerDTO dto) {
        Connection con = null;
        Statement stmt = null;

        try{
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ecommerce_myntra","root","Xworkzodc@123");
            stmt = con.createStatement();
            int noOfRowsAffected = stmt.executeUpdate("insert into customers values (2,'sharan','9113613246','mandya','sharanselvam@gmail.com','blacklivesmatter'),(3,'gagan','8904603746','hasan','gagan69@gmail.com','silvershades')," +
                    "(4,'pavan','1234567890','hubli','pavangowda@gmail.com','beardismyidentity'),(5,'ullas','9113613236','anekal','ullas@gmail.com','ridealways')");
            System.out.println(noOfRowsAffected);
            return  true;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (stmt!=null){
                try{
                    stmt.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }

            }
            if (con!= null){
                try{
                    con.close();
                }catch (SQLException e){
                    throw  new RuntimeException(e);
                }

            }

        }
        return false;
    }
}
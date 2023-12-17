package com.myworkz.java_features.predefined_func_interfaces;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExecutor {
    public static void main(String[] args) {
        /*To get date*/
        Supplier<Date> getDate = () -> new Date();
        System.out.println(getDate.get());

        System.out.println();
        /*To generate OTP*/
        Supplier<String> getOTP = () -> {
            String otp = "";
            for (int i=0;i<6;i++){
                otp = otp+(int)(Math.random()*10);
            }
            return otp;
        };

        System.out.println(getOTP.get());
        System.out.println(getOTP.get());
        System.out.println(getOTP.get());
        System.out.println(getOTP.get());
    }
}

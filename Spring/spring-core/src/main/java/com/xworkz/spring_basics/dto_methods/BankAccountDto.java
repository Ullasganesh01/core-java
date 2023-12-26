package com.xworkz.spring_basics.dto_methods;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class BankAccountDto {
    @Value("12345678")
    private double accNo;
    @Value("Tejas")
    private String accHolderName;
    @Value("25000")
    private double balance;

//    public BankAccountDto(@Value("12345678") double accNo,@Value("Tejas") String accHolderName,@Value("25000") double balance) {
//        this.accNo = accNo;
//        this.accHolderName = accHolderName;
//        this.balance = balance;
//    }

    public double getAccBalance(){
        return this.getBalance();
    }

    public void credit(double amount){
        this.balance = this.balance+amount;
        System.out.println(amount + " Credited!!");
    }

    public void debit(double amount){
        this.balance -= amount;
        System.out.println(amount + " Debited!!");
    }
}

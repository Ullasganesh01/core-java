package com.sbi.bank.savings_account;

import com.sbi.bank.bank_account.BankAccount;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String name){
        super(name);
    }

    final double interestRate = 2.0;

    public void getRateOfInterest(){
        double interest = (getBalance()*interestRate)/100;
        credit(interest);
    }

}

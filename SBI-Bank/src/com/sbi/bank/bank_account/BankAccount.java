package com.sbi.bank.bank_account;

import java.time.LocalDate;

public class BankAccount {
    private double balance;
    String name;

    public BankAccount(){

    }
    public BankAccount(String name){
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount){
        if(amount>0){
            this.balance = balance + amount;
            System.out.println("Amount credited : " + amount +" to " + name + " at " + LocalDate.now());
        }else {
            System.out.println("Amount must be greater than zero");
        }
    }

    public void debit(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount debited : " + amount +" from " + name + " at " + LocalDate.now());
        }else {
            System.out.println("Insufficient balance");
        }
    }

    public void printBalance(){
        System.out.println("Current balance : "+getBalance() + " of " + this.name);
        System.out.println();
    }

    public void transfer(double amount,BankAccount toAccount){
        this.debit(amount);
        toAccount.credit(amount);
        System.out.println("Amount : " + amount + " is transferred from " + this.name + " to " + toAccount.name );
        System.out.println();
    }
}

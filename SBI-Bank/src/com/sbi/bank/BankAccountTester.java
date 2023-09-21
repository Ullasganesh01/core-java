package com.sbi.bank;

import com.sbi.bank.bank_account.BankAccount;
import com.sbi.bank.savings_account.SavingsAccount;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount ullas = new SavingsAccount("Ullas");
        ullas.credit(10000);
        ullas.printBalance();
        ullas.debit(2000);
        ullas.printBalance();

        SavingsAccount tejas = new SavingsAccount("Tejas");
        tejas.credit(3000);
        tejas.printBalance();

        ullas.transfer(2000,tejas);
        ullas.printBalance();
        tejas.printBalance();

        SavingsAccount sharan = new SavingsAccount("Sharan");
        tejas.transfer(2500,sharan);
        sharan.printBalance();
        tejas.printBalance();

        ullas.transfer(1000,sharan);
        ullas.printBalance();
        sharan.printBalance();

        sharan.printBalance();
        sharan.transfer(200,tejas);
        tejas.printBalance();
        ullas.printBalance();
        ullas.transfer(100,ullas);
        ullas.printBalance();


//        SavingsAccount ullasg = (SavingsAccount) ullas;
//        ullasg.getRateOfInterest();
//        ullasg.printBalance();


        tejas.getRateOfInterest();
        tejas.printBalance();

        sharan.getRateOfInterest();
        sharan.printBalance();

    }

}

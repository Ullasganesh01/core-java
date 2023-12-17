package com.xworkz.bank;

import com.xworkz.bank.dto.ATMCardDto;
import com.xworkz.bank.dto.AccountDto;
import com.xworkz.bank.service.BankService;
import com.xworkz.bank.service.impl.BankServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankService bankService = new BankServiceImpl();
        while (true){
            System.out.println();
            System.out.println("Welcome to Bank");
            System.out.println("1.To create new account");
            System.out.println("2.To fetch account by Id");
            System.out.println("3.To fetch atm card details by Id");
            System.out.println();
            System.out.println("Enter the choice : ");
            int choice = s.nextInt();
            if (choice>0 && choice <4){
                int accId;
                String accHolderName;
                long accNumber;
                String micrCode;
                String ifscCode;

                int cardId;
                long cardNumber;
                String bankName;
                String cardHolderName;
                LocalDate expiryDate;
                int cvv;

                ATMCardDto atmCardDto;
                AccountDto accountDto;
                switch (choice){
                    case 1:
                        System.out.println("Enter the account number :");
                        accNumber = s.nextLong();
                        System.out.println("Enter the account holder name :");
                        accHolderName = s.next();
                        System.out.println("Enter the MICR Code :");
                        micrCode = s.next();
                        System.out.println("Enter IFSC Code :");
                        ifscCode = s.next();
                        System.out.println("Enter the card details:");
                        System.out.println("Enter card number :");
                        cardNumber = s.nextLong();
                        System.out.println("Enter bank name :");
                        bankName = s.next();
                        System.out.println("Enter card holder name :");
                        cardHolderName = s.next();
                        System.out.println("Enter the expiry date(MM-YYYY) :");
                        //int dd = s.nextInt();
                        int mm = s.nextInt();
                        int yyyy = s.nextInt();
                        expiryDate = LocalDate.of(yyyy,mm,1);
                        System.out.println("Enter CVV :");
                        cvv = s.nextInt();

                        atmCardDto = ATMCardDto.builder()
                                .cardNumber(cardNumber)
                                .bankName(bankName)
                                .cardHolderName(cardHolderName)
                                .expiryDate(expiryDate)
                                .cvv(cvv)
                                .build();


                        accountDto = AccountDto.builder()
                                .accNumber(accNumber)
                                .accHolderName(accHolderName)
                                .micrCode(micrCode)
                                .ifscCode(ifscCode)
                                .ATMCard(atmCardDto)
                                .build();
                        bankService.validateCreateAccount(accountDto);
                        break;
                    case 2:
                        System.out.println("Enter the Account id");
                        accId = s.nextInt();
                        bankService.validateGetAccountDetailsById(accId);
                        break;
                    case 3:
                        System.out.println("Enter the ATM card id");
                        cardId = s.nextInt();
                        bankService.validateGetATMCardDetailsById(cardId);
                        break;
                    default:
                        System.out.println("Enter the proper choice ");
                }
            }else {
                break;
            }
        }
    }
}

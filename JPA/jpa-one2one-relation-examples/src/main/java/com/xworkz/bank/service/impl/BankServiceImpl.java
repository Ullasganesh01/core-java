package com.xworkz.bank.service.impl;

import com.xworkz.bank.dto.ATMCardDto;
import com.xworkz.bank.dto.AccountDto;
import com.xworkz.bank.repository.BankRepository;
import com.xworkz.bank.repository.impl.BankRepositoryImpl;
import com.xworkz.bank.service.BankService;

public class BankServiceImpl implements BankService {
    private static BankRepository bankRepository = new BankRepositoryImpl();
    @Override
    public void validateCreateAccount(AccountDto dto) {
        if (dto!=null){
            if (dto.getAccHolderName()!=null && dto.getAccNumber()>0 && dto.getMicrCode()!=null && dto.getIfscCode()!=null &&dto.getATMCard()!=null){
                ATMCardDto cardDto = dto.getATMCard();
                if (cardDto.getCardNumber()>0 && cardDto.getBankName()!=null && cardDto.getCardHolderName()!=null && cardDto.getExpiryDate()!=null && cardDto.getCvv()>0){
                    bankRepository.createAccount(dto);
                }
            }else {
                System.out.println("Invalid details has been entered");
            }
        }else {
            System.out.println("Account is null");
        }
    }

    @Override
    public void validateGetAccountDetailsById(int id) {
        if (id>0){
            System.out.println(bankRepository.getAccountDetailsById(id));
        }else {
            System.out.println("Invalid Id");
        }
    }

    @Override
    public void validateGetATMCardDetailsById(int id) {
        if (id>0){
            System.out.println(bankRepository.getATMCardDetailsById(id));
        }else {
            System.out.println("Invalid Id");
        }
    }
}

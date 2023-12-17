package com.xworkz.bank.repository;

import com.xworkz.bank.dto.ATMCardDto;
import com.xworkz.bank.dto.AccountDto;

public interface BankRepository {
    void createAccount(AccountDto dto);
    AccountDto getAccountDetailsById(int id);
    ATMCardDto getATMCardDetailsById(int id);
}

package com.xworkz.bank.service;

import com.xworkz.bank.dto.AccountDto;

public interface BankService {
    void validateCreateAccount(AccountDto dto);
    void validateGetAccountDetailsById(int id);
    void validateGetATMCardDetailsById(int id);
}

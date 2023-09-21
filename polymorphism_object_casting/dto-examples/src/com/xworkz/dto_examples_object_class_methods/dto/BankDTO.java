package com.xworkz.dto_examples_object_class_methods.dto;
//Object class 3 methods overriding
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BankDTO {
    private long accountId;
    private String accountHolder;
    private String bankName;

    @Override
    public String toString() {
        return "BankDTO{" + "accountId = " + accountId + ", accountHolder = " + accountHolder + ", bankName = " + bankName + '}';
    }

    @Override
    public int hashCode() {
        int accountId = (int) this.accountId;
        return accountId;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof BankDTO){
            BankDTO bankDTO = (BankDTO) obj;
            if ((this.hashCode() == bankDTO.hashCode()) && (this.getAccountHolder().equals(bankDTO.getAccountHolder())) && (this.getBankName().equals(bankDTO.getBankName())))
                return true;
        }
        return false;
    }
}

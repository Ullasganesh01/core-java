package com.xworkz.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "account_info")
public class AccountDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int accId;
    @Column(name = "acc_number")
    private long accNumber;
    @Column(name = "acc_holder_name")
    private String accHolderName;
    @Column(name = "micr_code")
    private String micrCode;
    @Column(name = "ifsc_code")
    private String ifscCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private ATMCardDto ATMCard;
}

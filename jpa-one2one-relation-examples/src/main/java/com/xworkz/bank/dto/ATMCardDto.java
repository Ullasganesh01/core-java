package com.xworkz.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "atm_card")
public class ATMCardDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private int cardId;
    @Column(name = "card_number")
    private long cardNumber;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "holder_name")
    private String cardHolderName;
    @Column(name = "expiry_date")
    private LocalDate expiryDate;
    @Column(name = "cvv")
    private int cvv;
}

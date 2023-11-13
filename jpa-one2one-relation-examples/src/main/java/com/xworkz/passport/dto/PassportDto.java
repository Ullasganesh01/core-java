package com.xworkz.passport.dto;

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
@Table(name = "passport")
public class PassportDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passId;
    private String pHolderName;
    private String nationality;
    private String address;

    @OneToOne(mappedBy = "passport")
    //@JoinColumn(name = "person_id")
    private PersonDto person;
}

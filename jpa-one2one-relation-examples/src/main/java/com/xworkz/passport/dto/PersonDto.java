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
@Table(name = "person")
public class PersonDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;
    private String pName;
    private long mobileNo;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pass_Id")
    private PassportDto passport;
}

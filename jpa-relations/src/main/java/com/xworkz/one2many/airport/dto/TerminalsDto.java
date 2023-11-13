package com.xworkz.one2many.airport.dto;

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
@Table(name = "terminals")
public class TerminalsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int terminalId;
    private String terminalName;
//    @ManyToOne(targetEntity = AirportDto.class,cascade = CascadeType.ALL)
//    private AirportDto airport;
}

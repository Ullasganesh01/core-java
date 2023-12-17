package com.xworkz.many2many.airport.dto;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "airport")
public class AirportDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String airportName;
    private String city;
    private String type;
    @ManyToMany(targetEntity = TerminalsDto.class)
    private List<TerminalsDto> terminals;
}

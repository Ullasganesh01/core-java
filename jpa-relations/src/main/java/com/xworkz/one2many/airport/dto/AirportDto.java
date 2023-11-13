package com.xworkz.one2many.airport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
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
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<TerminalsDto> terminals;
}

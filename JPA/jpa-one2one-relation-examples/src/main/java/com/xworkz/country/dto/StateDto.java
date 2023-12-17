package com.xworkz.country.dto;

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
@Table(name = "states")
public class StateDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stateId;
    private String state;
    private String country;
    private String continent;
    @OneToOne(targetEntity = CapitalCityDto.class)//(cascade = CascadeType.ALL)
   //@JoinColumn(name = "city_id")
    private CapitalCityDto capitalCity;
}

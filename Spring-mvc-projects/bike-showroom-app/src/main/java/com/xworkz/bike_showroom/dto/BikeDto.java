package com.xworkz.bike_showroom.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "bikes")
@NamedQueries({
        @NamedQuery(name = "getAllBikes",query = "from BikeDto dto")
})
public class BikeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank
    private String bikeName;

    @NotNull
    @NotBlank
    private String engineCC;

    @NotNull
    @NotBlank
    private String color;

    @NotNull
    @NotBlank
    private String bikeType;

    @NotNull
    @NotBlank
    private String company;

    @NotNull
    private int gears;

    @NotNull
    private double exShowroomPrice;
}

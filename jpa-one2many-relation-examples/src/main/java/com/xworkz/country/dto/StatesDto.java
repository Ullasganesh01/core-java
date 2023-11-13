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
public class StatesDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sId;
    private String name;
    private String language;
    private String capital;
}

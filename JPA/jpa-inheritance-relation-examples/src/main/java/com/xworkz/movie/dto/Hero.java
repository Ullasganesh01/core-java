package com.xworkz.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "hero")
@DiscriminatorValue(value = "hero")
public class Hero extends ActorsDto{
    private String role;
    private int timings;
}

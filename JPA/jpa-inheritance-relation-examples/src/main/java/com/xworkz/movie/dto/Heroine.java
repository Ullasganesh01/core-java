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
@Table(name = "heroine")
@DiscriminatorValue(value = "heroine")
public class Heroine extends ActorsDto{
    private int makeUpFees;
}

package com.xworkz.mobile.dto;

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
@Table(name = "battery")
public class BatteryDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bId;
    private int capacity;
    private String bName;
}

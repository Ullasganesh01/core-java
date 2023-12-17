package com.xworkz.binge.dto;

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
@Table(name = "ott_apps")
public class OttDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oId;
    private String ottName;
    private int ratings;
}

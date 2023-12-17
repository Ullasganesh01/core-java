package com.xworkz.binge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "binge")
public class BingeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bingeName;
    private String planType;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<OttDto> ott;
}

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
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String bingeName;
//    private String planType;
//    @ManyToMany(targetEntity = OttDto.class)
//    private List<OttDto> ott;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String bingeName;
//    private String planType;
//    @ManyToMany   // same as above
//    private List<OttDto> ott;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String bingeName;
//    private String planType;
//    @ManyToMany(cascade = CascadeType.ALL) // repeated values
//    private List<OttDto> ott;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String bingeName;
//    private String planType;
//    @ManyToMany(mappedBy = "binge")//best approach
//    private List<OttDto> ott;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String bingeName;
//    private String planType;
//    @ManyToMany(mappedBy = "binge")// this is also best-- use exec2
//    private List<OttDto> ott;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bingeName;
    private String planType;
    @ManyToMany(mappedBy = "binge")
    private List<OttDto> ott;
}

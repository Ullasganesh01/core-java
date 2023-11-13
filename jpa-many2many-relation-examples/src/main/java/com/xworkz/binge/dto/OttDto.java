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
@Table(name = "ott_apps")  // Uni-directional
public class OttDto {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int oId;
//    private String ottName;
//    private int ratings;
//    @ManyToMany(targetEntity = BingeDto.class)
//    private List<BingeDto> binge;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int oId;
//    private String ottName;
//    private int ratings;
//    @ManyToMany // same as above and executor also
//    private List<BingeDto> binge;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int oId;
//    private String ottName;
//    private int ratings;
//    @ManyToMany //repeated values
//    private List<BingeDto> binge;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int oId;
//    private String ottName;
//    private int ratings;
//    @ManyToMany
//    @JoinTable(name = "ott_binge",joinColumns = @JoinColumn(name = "ott_id"),inverseJoinColumns = @JoinColumn(name = "binge_id"))
//    private List<BingeDto> binge;//best approach

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int oId;
//    private String ottName;
//    private int ratings;
//    @ManyToMany // this is also best -- use exec2
//    private List<BingeDto> binge;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oId;
    private String ottName;
    private int ratings;
    @ManyToMany
    private List<BingeDto> binge;
}

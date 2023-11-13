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
@Table(name = "mobile")
public class MobileDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mId;
    private String mName;
    private String storage;
    private String ram;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn//(name = "bId")
    private BatteryDto battery;
}

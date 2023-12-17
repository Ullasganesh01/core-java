package com.xworkz.multiplex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "multiplex")
public class MultiplexDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    @OneToMany(targetEntity = ScreensDto.class,cascade = CascadeType.ALL)
    private List<ScreensDto> screens;
}

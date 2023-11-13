package com.xworkz.multiplex.dto;

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
@Table(name = "screens")
public class ScreensDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sId;
    private String screenNumber;
    private String movieDisplayed;
    private int capacity;
    @ManyToOne
    private MultiplexDto multiplex;
}

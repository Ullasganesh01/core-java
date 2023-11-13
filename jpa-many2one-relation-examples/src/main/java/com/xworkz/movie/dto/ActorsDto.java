package com.xworkz.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "actors")
public class ActorsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aId;
    private String actorName;
    private int earnings;
    private String gender;
    @ManyToOne
    @JoinColumn(name = "mov_id")
    private MovieDto movie;
}

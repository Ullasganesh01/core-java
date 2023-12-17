package com.xworkz.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "actors")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class ActorsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int aId;
    protected String actorName;
    protected int earnings;
    protected String gender;
}

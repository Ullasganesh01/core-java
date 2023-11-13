package com.xworkz.many2many.airport.dto;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "terminals")
@NamedQuery(name = "getAirportInfoByTerminalId", query = "select dto from TerminalsDto dto where dto.terminalId =:id")
public class TerminalsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int terminalId;
    private String terminalName;
    @ManyToMany(targetEntity = AirportDto.class)
    private List<AirportDto> airport;
}

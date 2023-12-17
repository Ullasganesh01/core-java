package com.xworkz.many2one.airport.dto;

import lombok.*;

import javax.persistence.*;

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
    @ManyToOne
    @JoinColumn(name = "id")
    private AirportDto airport;
}

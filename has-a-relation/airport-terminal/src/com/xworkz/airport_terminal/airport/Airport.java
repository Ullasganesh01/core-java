package com.xworkz.airport_terminal.airport;

import com.xworkz.airport_terminal.terminal.Terminal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Airport {
    public Terminal terminal;
    private int terminalId;

}

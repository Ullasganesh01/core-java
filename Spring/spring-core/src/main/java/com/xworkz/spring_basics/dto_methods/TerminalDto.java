package com.xworkz.spring_basics.dto_methods;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope(value = "prototype")
public class TerminalDto {

    private int terminalId;

    private String terminalName;


    public TerminalDto(){
        System.out.println("Terminal constructor");
    }

    @Autowired
    public TerminalDto(@Value("2") int terminalId, @Value("Thor") String terminalName) {
        this.terminalId = terminalId;
        this.terminalName = terminalName;
        System.out.println("Terminal Parameterized Constructor");
    }
}

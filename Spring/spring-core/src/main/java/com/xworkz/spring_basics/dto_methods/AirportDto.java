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
public class AirportDto {
    @Value("1")
    private int id;
    @Autowired
    private TerminalDto terminal;

    public AirportDto(){
        System.out.println("Airport constructor");
    }

//    @Autowired
//    public AirportDto(@Value("1") int id, TerminalDto terminal) {
//        this.id = id;
//        this.terminal = terminal;
//        System.out.println("Airport Parameterized constructor");
//    }
}
/*
@Autowired -  It is used to refer or inject a dependent Object
in spring the default object creation scope is singleton -- so use prototype to create different objects
5 scopes - singleton, prototype , session, request, global
scope - boundary to manage data
the process of referring the dependent object is called dependency injection
IOC - inversion of control -- it is a design pattern which states the control of an object must be inverted to an external entity/container -- spring container(Application context)
                                                                   or inverting the control of an object to an external entity
                               one of the method of IOC - DI
Spring framework is used to manage components for an app , implements IOC
*/
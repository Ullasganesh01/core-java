package com.xworkz.spring_basics;

import com.xworkz.spring_basics.dto_methods.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MethodsExecutor {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.xworkz.spring_basics.dto_methods");

//        BankAccountDto bankAccountDto = context.getBean(BankAccountDto.class);
//        System.out.println(bankAccountDto);
//        bankAccountDto.credit(9600);
//        System.out.println(bankAccountDto.getAccBalance());
//        bankAccountDto.debit(3500);
//        System.out.println(bankAccountDto.getAccBalance());
//        System.out.println(bankAccountDto);
//
//        System.out.println();
//
//        ACDto acDto = (ACDto) context.getBean("ac");
//        System.out.println(acDto);
//        acDto.onOrOff();
//        acDto.decreaseTemperature();
//        System.out.println(acDto.getCurrentTemp());
//        acDto.increaseTemperature();
//        acDto.increaseTemperature();
//        System.out.println(acDto.getCurrentTemp());
//        System.out.println(acDto);
//
//        System.out.println();
//
//        SpeakerDto speakerDto = context.getBean(SpeakerDto.class);
//        System.out.println(speakerDto);
//        speakerDto.onOrOff();
//        speakerDto.increaseVolume();
//        System.out.println(speakerDto.getCurrentVolume());
//        speakerDto.increaseVolume();
//        speakerDto.increaseVolume();
//        System.out.println(speakerDto.getCurrentVolume());
//        speakerDto.decreaseVolume();
//        System.out.println(speakerDto.getCurrentVolume());
//        System.out.println(speakerDto);
//
//        System.out.println();
//
//        WashingMachineDto washingMachineDto = (WashingMachineDto) context.getBean("washingMachine");
//        System.out.println(washingMachineDto);
//        washingMachineDto.onOrOff();
//        washingMachineDto.increaseTime();
//        washingMachineDto.increaseTime();
//        System.out.println(washingMachineDto.getTimer());
//        washingMachineDto.increaseTime();
//        System.out.println(washingMachineDto.getTimer());
//        washingMachineDto.decreaseTime();
//        System.out.println(washingMachineDto.getTimer());
//        System.out.println(washingMachineDto);
//
//        System.out.println();
//
//        OvenDto ovenDto = context.getBean(OvenDto.class);
//        System.out.println(ovenDto);
//        ovenDto.onOrOff();
//        ovenDto.increaseTime();
//        ovenDto.increaseTime();
//        ovenDto.increaseTime();
//        System.out.println(ovenDto.getTimer());
//        ovenDto.decreaseTime();
//        System.out.println(ovenDto.getTimer());
//        System.out.println(ovenDto);
//
//        System.out.println();

        AirportDto airportDto = context.getBean(AirportDto.class);
        airportDto.setId(1);
        airportDto.getTerminal().setTerminalId(1);
        airportDto.getTerminal().setTerminalName("Thor");

        AirportDto airportDto1 = context.getBean(AirportDto.class);
        airportDto1.setId(2);
        airportDto1.getTerminal().setTerminalId(2);
        airportDto1.getTerminal().setTerminalName("Batman");

        AirportDto airportDto2 = context.getBean(AirportDto.class);
        airportDto2.setId(3);
        airportDto2.getTerminal().setTerminalId(3);
        airportDto2.getTerminal().setTerminalName("Loki");

        System.out.println(airportDto);
        System.out.println(airportDto1);
        System.out.println(airportDto2);
    }
}

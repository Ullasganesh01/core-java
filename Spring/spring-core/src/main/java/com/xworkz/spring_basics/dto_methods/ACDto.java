package com.xworkz.spring_basics.dto_methods;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("ac")
public class ACDto {

    @Value("Voltas")
    private String name;
    @Value("16")
    private int minTemp;
    @Value("26")
    private int maxTemp;
    @Value("16")
    private int currentTemp;
    @Value("false")
    private boolean isPowered;

    public boolean onOrOff() {
        if(isPowered ==  false){
            isPowered = true;
            System.out.println("AC is Switched ON.");
        }else if(isPowered){
            isPowered = false;
            System.out.println("AC is Switched OFF.");
        }
        //System.out.println();
        return isPowered;
    }

    public  void increaseTemperature(){
        if(isPowered){
            if(currentTemp<maxTemp){
                currentTemp++;
                System.out.println("Temperature is : "+currentTemp);
            }
            else{
                System.out.println("Max Temperature Reached.");
            }
        }
        else{
            System.out.println("Switch on the AC first.");
        }
       // System.out.println();
    }
    public  void decreaseTemperature(){
        if(isPowered){
            if(currentTemp>minTemp){
                currentTemp--;
                System.out.println("Temperature is : " +currentTemp);
            }else{
                System.out.println("Min Temperature Reached.");
            }
        }else{
            System.out.println("Switch on the AC first.");
        }
       // System.out.println();
    }
}

package com.xworkz.spring_basics.dto_methods;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class OvenDto {
    private String name;
    private int minTime;
    private int maxTime;
    private int timer;
    private boolean isPowered;

    public OvenDto(@Value("Godrej") String name,@Value("10") int minTime,@Value("60") int maxTime,@Value("0") int timer,@Value("false") boolean isPowered) {
        this.name = name;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.timer = timer;
        this.isPowered = isPowered;
    }

    public boolean onOrOff() {
        if(!isPowered){
            isPowered = true;
            System.out.println("Oven is Switched ON.");
        }else if(isPowered){
            isPowered = false;
            System.out.println("Oven is Switched OFF.");
        }
        return isPowered;
    }

    public void increaseTime(){
        if(isPowered){
            if(timer<maxTime){
                timer = timer+10;
                System.out.println("Time is : "+timer);
            }
            else{
                System.out.println("Max Time Reached.");
            }
        }
        else{
            System.out.println("Switch on the Oven first.");
        }
    }
    public void decreaseTime(){
        if(isPowered){
            if(timer>minTime){
                timer = timer-10;
                System.out.println("Time is : " +timer);
            }else{
                System.out.println("Min Time Reached.");
            }
        }else{
            System.out.println("Switch on the Oven first.");
        }
    }
}

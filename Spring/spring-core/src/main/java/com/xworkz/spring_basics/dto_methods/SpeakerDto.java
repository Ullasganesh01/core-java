package com.xworkz.spring_basics.dto_methods;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class SpeakerDto {
    @Value("JBL")
    private String name;
    @Value("0")
    private int minVolume;
    @Value("10")
    private int maxVolume;
    @Value("0")
    private int currentVolume;
    @Value("false")
    private boolean isConnected;

    public boolean onOrOff() {
        if(!isConnected){
            isConnected = true;
            System.out.println("Speaker is Turned ON.");
        }else if(isConnected){
            isConnected = false;
            System.out.println("Speaker is Turned OFF.");
        }
        return isConnected;
    }

    public void increaseVolume(){
        if(isConnected){
            if(currentVolume<maxVolume){
                currentVolume++;
                System.out.println("Volume is : "+currentVolume);
            }
            else{
                System.out.println("Max Volume Reached.");
            }
        }
        else{
            System.out.println("Turn on the speaker first.");
        }
    }
    public void decreaseVolume(){
        if(isConnected){
            if(currentVolume>minVolume){
                currentVolume--;
                System.out.println("Volume is : " +currentVolume);
            }else{
                System.out.println("Min Volume Reached.");
            }
        }else{
            System.out.println("Turn on the speaker first.");
        }
    }
}

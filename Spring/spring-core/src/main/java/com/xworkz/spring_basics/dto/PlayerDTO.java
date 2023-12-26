package com.xworkz.spring_basics.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlayerDTO {

    private int playerID;

    private String playerName;

    public PlayerDTO(@Value("1") int playerID,@Value("virat") String playerName) {
        this.playerID = playerID;
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "playerID=" + playerID +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}

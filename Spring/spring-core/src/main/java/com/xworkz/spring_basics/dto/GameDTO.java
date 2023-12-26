package com.xworkz.spring_basics.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("game")
public class GameDTO {
//    @Value("1")
    private int gameID;
//    @Value("cricket")
    private String gameName;
//    @Autowired
    private PlayerDTO player;

    @Autowired
    public GameDTO(@Value("1") int gameID,@Value("football") String gameName,PlayerDTO player){
        this.gameID = gameID;
        this.gameName = gameName;
        this.player = player;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "gameID=" + gameID +
                ", gameName='" + gameName + '\'' +
                ", player=" + player +
                '}';
    }
}

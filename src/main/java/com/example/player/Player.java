package com.example.player;

public class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName,int jerseyNumber, String role) {
        this.playerId = playerId ;
        this.playerName = playerName ;
        this.jerseyNumber = jerseyNumber ;
        this.role = role ;
    }

    public int getplayerId() {
        return playerId ;
    }

    public void setplayerId(int playerId) {
        this.playerId = playerId ;
    }

    public String getplayerName() {
        return playerName ;
    }

    public void setplayerName(String playerName) {
        this.playerName = playerName ;
    }

    public int getjerseyNumber() {
        return jerseyNumber ;
    }

    public void setjerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber ;
    }

    public String getRole() {
        return role ;
    }

    public void setRole(String role){
        this.role = role ;
    }
}
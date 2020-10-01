package com.emisdep;

public class Room {
    private String number;
    private String type;
    private String floor;
    private boolean occupied;
    private boolean needsCleaning;
    private Client occupant;
    private float averagePrice;

    public Room (String number, String type, String floor, float averagePrice) {
        this.number = number;
        this.type = type;
        this.floor = floor;
        this.averagePrice = averagePrice;
    }

    public Room(String type) {
        this.type = type;
    }

    public Room() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getFloor() {
        return floor;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }

    public boolean getNeedsCleaning(){
        return needsCleaning;
    }

    public void setNeedsCleaning(boolean needsCleaning){
        this.needsCleaning = needsCleaning;
    }

    public boolean reserve(String room){
        if(!(occupied && needsCleaning)){
            occupied = true;
            return true;
        }
        else{
            System.out.println("Room is not available");
            return false;
        }
    }

    public void checkout(Client client){
        client = null;
        occupied = false;
        needsCleaning = true;
    }

    public String clean(){
        needsCleaning = false;
        return "room cleaned";
    }



}

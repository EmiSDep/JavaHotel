package com.emisdep;

public class StandardRoom extends Room{

    private int rooms;
    private int beds;


    public StandardRoom(String type, int rooms, int beds) {
        super();
        this.rooms = rooms;
        this.beds = beds;
    }

    public int getBeds(){
        return beds;
    }

    @Override
    public boolean reserve(Client client) {
        if(client.getPartySize() > beds * 2) {
            System.out.println("Room not available");
            return false;
        }
        return super.reserve(client);
    }

    public int getRooms(){
        return rooms;
    }

    public void setRooms(int rooms){
        this.rooms = rooms;
    }
}

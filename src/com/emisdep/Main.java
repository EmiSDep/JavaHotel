package com.emisdep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room room = new Room();
        room.setNeedsCleaning(false);
        System.out.println(room.getNeedsCleaning());
    }
}

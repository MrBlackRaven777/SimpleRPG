package places;

import Characters.Monster;

import java.util.ArrayList;

public class Room {
    //TODO loading room content from xml file
    public String roomName;
    public ArrayList<Room> releatedRooms = new ArrayList<>();
    public String roomDescription;
    public Monster roomMonster;

    public Room(String roomName, ArrayList<Room> releatedRooms, String roomDescription, Monster roomMonster) {
        this.roomName = roomName;
        this.releatedRooms = releatedRooms;
        this.roomDescription = roomDescription;
        this.roomMonster = roomMonster;
    }
}

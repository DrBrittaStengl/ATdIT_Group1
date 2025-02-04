package model.implementation;

import model.People;

public class Resident extends People {
    private int resID;
    private int room;
    private int stationID;

    public int getResID() { return resID; }

    public int getRoom() { return room; }

    public int getStationID() { return stationID; }

    public void setResID(int resID) { this.resID = resID; }

    public void setRoom(int room) { this.room = room; }

    public void setStationID(int stationID) { this.stationID = stationID; }

    public Resident(int resID, String name, String surname, int age, int stationID, int room){
        this.resID = resID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.stationID = stationID;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", resID=" + resID +
                ", room=" + room +
                ", stationID=" + stationID +
                '}';
    }
}

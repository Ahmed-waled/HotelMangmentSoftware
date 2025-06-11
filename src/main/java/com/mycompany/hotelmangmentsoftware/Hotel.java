package com.mycompany.hotelmangmentsoftware;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
    private String name;
    private String password;
    private String Location;
    private String country;
    private String city;
    private int id;

    public Hotel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Hotel(String name, String password, int id) {
        this(name, password);
        this.id = id;
    }

    public Hotel(String name, String password, int id, String location, String country, String city) {
        this(name, password, id);
        this.Location = location;
        this.country = country;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return Location;
    }

    public String getPassword() {
        return password;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    // enable hotel to add room,
    boolean addRoom(Room room) {
        if(DatabaseManagement.addRoomQuery(this.id, room.getBeds(), room.getPricePerDay(), room.getSize())) {
            room.setRoomID(DatabaseManagement.getLastAddedRoomIDQuery());
            return true;
        }
        else{
            return false;
        }
    }
    int removeRoom(int room_id) {
        return DatabaseManagement.deleteRoomQuery(this.id, room_id);
    }
    ArrayList<String[]> showFeedbacks(){
        return DatabaseManagement.getFeedbackOfHotelQuery(this.getId());
    }
    ArrayList<String[]> showBooking(){
        return DatabaseManagement.getBookedRoomsQuery(this.name);
    }


}
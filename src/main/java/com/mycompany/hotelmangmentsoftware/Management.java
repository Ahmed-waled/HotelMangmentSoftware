package com.mycompany.hotelmangmentsoftware;
import java.util.ArrayList;
import java.util.Date;

public class Management {

    // return ID for registered guest, returns -1 in failed query
    private static Boolean checkValidGuestUsername(String username){
        return DatabaseManagement.checkUsedGuestUsernameQuery(username);
    }

    // returns ID for registered Hotel, in case of failed query return -1
    private static Boolean checkValidHotelName(String name){
        return DatabaseManagement.checkUsedHotelNameQuery(name);
    }

    // it returns instance of Guest when query is done, otherwise it returns null
    public static Guest registerGuest(String username, String password) {
        if (checkValidGuestUsername(username))
            return null;
        try {
            // insert new guest entry
            DatabaseManagement.insertGuestQuery(username, password);

            //get guest_id
            int guest_id = DatabaseManagement.checkRegisteredGuestQuery(username, password);

            if (guest_id != -1) {
                return new Guest(username, password, guest_id);
                //print success message
            } else
                return null;
        } catch (Exception e) {
            return null;
        }
    }


    // it returns instance of Hotel when query is done, otherwise it returns null

    public static Hotel registerHotel(String address, String city, String country, String name, String password){
        if(checkValidHotelName(name))
            return null;
        try {
            DatabaseManagement.insertHotelQuery(address, city, country, name, password);
            int hotel_id = DatabaseManagement.checkRegisteredHotelQuery(name, password);
            if (hotel_id != -1) {

                return new Hotel(name, password, hotel_id, address, country, city);
                //print success message
            }
            return null;
        }
        catch (Exception e){
            return null;
        }
    }

    // return existed Guest ID in case of finding it, otherwise it returns -1
    private static int checkGuestLogin(String username, String password){
        return DatabaseManagement.checkRegisteredGuestQuery(username, password);
    }

    // return existed Hotel ID in case of finding it, otherwise it returns -1
    private static int checkHotelLogin(String name, String password){
        return DatabaseManagement.checkRegisteredHotelQuery(name, password);
    }


    // returns guest object in case of valid login, otherwise returns null
    public static Guest loginGuest(String username, String password){
        int guest_id = checkGuestLogin(username, password);
        if (guest_id != -1) {
            return new Guest(username, password, guest_id);
            //print success message
        }
        return null;
    }

    public static Hotel loginHotel(String name, String password){
        int hotel_id = checkHotelLogin(name, password);
        if(hotel_id != -1){
            return DatabaseManagement.getHotelDetailsByIDQuery(hotel_id);
        }
        return null;
    }


}


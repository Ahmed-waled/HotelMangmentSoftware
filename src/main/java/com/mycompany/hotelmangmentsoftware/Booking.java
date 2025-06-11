
package com.mycompany.hotelmangmentsoftware;
import java.util.Date;

public class Booking {
    private String checkInDate;
    private String checkOutDate;
    private int roomID;
    private int guestID;

    public Booking(String checkInDate, String checkOutDate, int roomID, int guestID) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomID = roomID;
        this.guestID = guestID;
    }

    public boolean makeBooking(){
        return DatabaseManagement.addBookingQuery(this.guestID, this.roomID, this.checkInDate, this.checkOutDate);
    }
}
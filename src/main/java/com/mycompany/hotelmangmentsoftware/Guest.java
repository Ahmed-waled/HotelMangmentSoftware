package com.mycompany.hotelmangmentsoftware;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;

public class Guest {

    private int guestId;
    private String username;
    private String password;

    public Guest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Guest(String username, String password, int guestId) {
        this(username, password);
        this.guestId = guestId;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getGuestId() {
        return guestId;
    }

    /**
     *
     * @param room the room needed to be booked
     * @param checkInDate start date in current format yyyy-mm-dd
     * @param checkOutDate end date in current format yyyy-mm-dd
     * @return true if booked successfully, otherwise failed
     */
    public boolean bookRoom(Room room, String checkInDate, String checkOutDate){
        Booking booking1 = new Booking(checkInDate, checkOutDate, room.getRoomID(), this.getGuestId());
        return booking1.makeBooking();

    }

    /**
     *
     * @param dateStr the given date
     * @return true if date is valid on given format YYYY-MM-DD, otherwise it returns false
     */

    private boolean isValidDate(String dateStr) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(dateStr, dateFormatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    /**
     *
     * @param checkInDate - start booking date in format yyyy-mm-dd
     * @param checkOutDate - end booking date in format yyyy-mm-dd
     * @return null if given date is invalid , otherwise it returns a List containing valid rooms in the following format (Hotel object, Room object)
     */
    public ArrayList<Object[]> searchByDate(String checkInDate, String checkOutDate){

        if(!isValidDate(checkInDate) || !isValidDate(checkOutDate))
            return null;

        return DatabaseManagement.getValidRoomsInCertainPeriod(checkInDate, checkOutDate);
    }

    public boolean addFeedbackForHotel(Hotel hotel, String review, float rating){
        Feedback feedback = new Feedback(review, rating, this.getGuestId(), hotel.getId());
        return feedback.makeFeedback();
    }

}

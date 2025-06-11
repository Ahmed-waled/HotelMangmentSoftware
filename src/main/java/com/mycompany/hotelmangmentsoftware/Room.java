package com.mycompany.hotelmangmentsoftware;
import java.sql.Date;

public class Room {
    private int roomID;
    private String type;
    private int beds;
    private int size;
    private int pricePerDay;

    public final static int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};

    public Room(String type, int beds, int size, int pricePerDay) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.pricePerDay = pricePerDay;
    }
    public Room(int roomID, String type, int beds, int size, int pricePerDay) {
        this(type, beds, size, pricePerDay);
        this.roomID = roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }
    public int getBeds() {
        return beds;
    }

    public int getRoomID() {
        return roomID;
    }

    /**
     *
     * @param checkInDate - start date
     * @param checkOutDate - end date
     * @return difference in days between them
     */
    public static int getDaysInPeriod(String checkInDate, String checkOutDate){
        /*
            Date format : YYYY-MM-DD
         */
        int yearBegin, yearEnd, monthBegin, monthEnd, dayBegin, dayEnd;

        // get year, month, day begin details
        yearBegin = Integer.parseInt(checkInDate.substring(0, 4));
        monthBegin = Integer.parseInt(checkInDate.substring(5, 7));
        dayBegin = Integer.parseInt(checkInDate.substring(8, 10));

        // get year, month, day end details
        yearEnd = Integer.parseInt(checkOutDate.substring(0, 4));
        monthEnd = Integer.parseInt(checkOutDate.substring(5, 7));
        dayEnd = Integer.parseInt(checkOutDate.substring(8, 10));

        // calculate relevant day from year value
        int endDayIndex = (yearEnd * 365 + yearEnd / 4);
        int beginDayIndex = (yearBegin * 365 + yearBegin / 4);

        //calculate relevant day from month value
        for(int i = 0; i < 12; ++i){
            if(i + 1 < monthBegin)
                // check if start year is a leap year
                beginDayIndex += (i == 1 && yearBegin % 4 == 0 ? 1 : 0) + Room.DAYS_IN_MONTHS[i];

            if(i + 1 < monthEnd)
                // check if end year is a leap year
                endDayIndex += (i == 1 && yearEnd % 4 == 0 ? 1 : 0) + Room.DAYS_IN_MONTHS[i];
        }

        // calculate relevant day from day value
        beginDayIndex += dayBegin;
        endDayIndex += dayEnd;

        return endDayIndex - beginDayIndex;

    }
    public double getTotalRoomPrice(Hotel hotel, String checkInDate, String checkOutDate){
//        double serviceHotel = DatabaseManagement.getHotelServicesPriceQuery(hotel.getName());
        int numberOfDays = getDaysInPeriod(checkInDate, checkOutDate);
        return numberOfDays * (this.getPricePerDay());
    }
    public double getTotalRoomPrice(String checkInDate, String checkOutDate){
//        double serviceHotel = DatabaseManagement.getHotelServicesPriceQuery(hotel.getName());
        int numberOfDays = getDaysInPeriod(checkInDate, checkOutDate);
        return numberOfDays * (this.getPricePerDay());
    }

}
package com.mycompany.hotelmangmentsoftware;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
            Testing out register and login functions
         */

        Guest g1 = Management.registerGuest("user1","user1_password");// new guest
        Guest g2 = Management.registerGuest("user1", "user1_another_password");// false, using same username
        Guest g3 = Management.loginGuest("user1", "user1_password");// valid login
        Guest g4 = Management.loginGuest("newUser", "newUser_password");// invalid login, no previous data
//        output(g1);
//        output(g2);
//        output(g3);
//        output(g4);

        /*
            Testing out hotel functions
         */

        Management.registerHotel("","","","sn","sansa123");// register new hotel

        Hotel h1 = Management.loginHotel( "sn", "sansa123"); // login hotel, success
        Room r1 = new Room("Single", 1, 140, 125);
        Room r2 = new Room("double", 2, 180, 150);
        Room r3 = new Room("Triple", 4, 200, 200);
        Room r4 = new Room("double", 3, 175, 155);
        Room r5 = new Room("double", 6, 250, 225);
        h1.addRoom(r3);
        h1.addRoom(r4);
        h1.addRoom(r5);
        if(h1.addRoom(r1)) // add Room, returns true
            System.out.println("success adding r1");
        else
            System.out.println("Failed adding r1");

        if(h1.addRoom(r2))
            System.out.println("success adding r2");
        else
            System.out.println("Failed adding r2");


        int removeRoomChk = h1.removeRoom(r1.getRoomID());
        if(removeRoomChk == 1) // test delete room given the id from db
            System.out.println("success removing r1");
        else if(removeRoomChk == 0)
            System.out.println("r1 is booked");
        else
            System.out.println("ID not found");


        if(g3.bookRoom(r5, "2024-05-16", "2024-06-01"))
            System.out.println("Success Booking r5");
        else
            System.out.println("Failed Booking r5");



        removeRoomChk = h1.removeRoom(r5.getRoomID());
        if(removeRoomChk == 1) // test delete room given the id from db
            System.out.println("success removing r5");
        else if(removeRoomChk == 0)
            System.out.println("r5 is booked");
        else
            System.out.println("ID not found");
        /*
            guest functions
        */
        if(g3.bookRoom(r2, "2024-06-15", "2024-07-01"))
            System.out.println("Success Booking r2");
        else
            System.out.println("Failed Booking r2");

        // test show booking function

        ArrayList<String[]> bookings = h1.showBooking();

        for(int i = 0; i < bookings.size(); ++i){
            System.out.printf("""
                    Booking details
                    check in date: %s,
                    check out date: %s,
                    room Id: %s,
                    Guest name: %s
                    %n\n""", bookings.get(i)[0], bookings.get(i)[1], bookings.get(i)[2], bookings.get(i)[3]);
        }



        // testing price function
        System.out.println("price for r2: " + r2.getTotalRoomPrice(h1, "2024-06-15", "2024-07-01"));

        //test searching by date
        ArrayList<Object[]> avilRooms = g3.searchByDate("2024-06-1", "2024-07-01");

        if(avilRooms == null){
            System.out.println("Invalid Date\n");
            return;
        }
        for(int i = 0; i < avilRooms.size(); ++i){
            Room rr = (Room) (avilRooms.get(i)[1]);
            Hotel hh = (Hotel) (avilRooms.get(i)[0]);
            System.out.printf("""
                    Current Hotel: %s
                    Current Room(Type, No of Beds, Size, Price per day): %s, %d, %d, %d
                    %n\n""", hh.getName(), rr.getType(), rr.getBeds(), rr.getSize(), rr.getPricePerDay());
        }
        if(g3.addFeedbackForHotel(h1, "Good", 3.5f)){
            System.out.println("Feedback is sent!");
        }
        else{
            System.out.println("can't send feedback!");
        }

        if(g3.addFeedbackForHotel(h1, "bad", 1.0f)){
            System.out.println("Feedback is sent!");
        }
        else{
            System.out.println("can't send feedback!");
        }


        // shows feedbacks for hotel
        System.out.println("""
                
                Show feedbacks for hotel h1
                """);
        ArrayList<String[]> feedbacks = h1.showFeedbacks();

        for(int i = 0; i < feedbacks.size(); ++i){
            System.out.printf("""
                    review: %s
                    rating: %s
                    """, feedbacks.get(i)[0], feedbacks.get(i)[1]);
        }

    }
    public static void output(Guest g){
        if(g != null)
            System.out.println("Success ");
        else
            System.out.println("Failed");
    }


}
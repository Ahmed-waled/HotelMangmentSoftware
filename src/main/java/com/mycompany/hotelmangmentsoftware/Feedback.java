package com.mycompany.hotelmangmentsoftware;


public class Feedback {
    private String review;
    private float rating;
    private int guestID;
    private int hotelID;


    public Feedback(String review, float rating, int guestID, int hotelID) {
        this.review = review;
        this.rating = rating;
        this.guestID = guestID;
        this.hotelID = hotelID;
    }

    public boolean makeFeedback(){
        return DatabaseManagement.addFeedbackQuery(this.guestID, this.hotelID, this.rating, this.review);
    }

}
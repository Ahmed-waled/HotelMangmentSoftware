package com.mycompany.hotelmangmentsoftware;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
public class DatabaseManagement {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/hbs";
    private static final String USER = "root";
    private static final String PASS = "Mody@2272004";

    private static final int INTEGER = 1;
    private static final int DOUBLE = 2;
    private static final int STRING = 3;

    // manages add and delete queries
    public static boolean writeActionQuery(Object[] args, String insertSQL) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(insertSQL);

            for (int i = 0; i < args.length; ++i) {
                if(args[i] instanceof String)
                    ps.setString(i + 1, (String)args[i]);
                else if (args[i] instanceof Integer)
                    ps.setInt(i + 1, (Integer)args[i]);
                else
                    ps.setFloat(i + 1, (Float)args[i]);
            }

            //check if row inserted correctly

            int rowInserted = ps.executeUpdate();
            return rowInserted > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    public static boolean writeCheckQuery(Object[] args, String selectSQL) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(selectSQL);

            for (int i = 0; i < args.length; ++i) {
                if(args[i] instanceof String)
                    ps.setString(i + 1, (String)args[i]);
                else if (args[i] instanceof Integer)
                    ps.setInt(i + 1, (Integer)args[i]);
                else
                    ps.setFloat(i + 1, (Float)args[i]);
            }

            //get query response
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                return rs.getInt("count_id")>0;
            else
                return false;

            //check if there exists ID with given arguments

        } catch (SQLException e) {
            return false;
        }
    }

    public static Object writeGetQuery(Object[] args, String getSQL, String columnLabel, int type) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(getSQL);

            for (int i = 0; i < args.length; ++i) {
                if(args[i] instanceof String)
                    ps.setString(i + 1, (String)args[i]);
                else if (args[i] instanceof Integer)
                    ps.setInt(i + 1, (Integer)args[i]);
                else
                    ps.setFloat(i + 1, (Float)args[i]);
            }

            //get query response
            ResultSet rs = ps.executeQuery();

            //get query value
            if(rs.next()) {

                if(type == INTEGER)
                    return rs.getInt(columnLabel);
                else if (type == DOUBLE)
                    return rs.getDouble(columnLabel);
                else
                    return rs.getString(columnLabel);
            }
            else
                return -1;

        } catch (SQLException e) {
            return -1;
        }
    }

    public static boolean insertHotelQuery(String address, String city, String country, String name, String password) {
        //prepare arguments
        Object[] args = {address, city, country, name, password};

        //prepare SQL Query
        String insertSQL = "INSERT INTO hotels(address, city, country, name, password) VALUES (?, ?, ?, ?, ?)";

        return writeActionQuery(args, insertSQL);

    }

    public static boolean insertGuestQuery(String username, String password) {
        Object[] args = {username, password};

        //prepare SQL Query
        String insertSQL = "INSERT INTO guests(username, password) VALUES (?, ?)";

        return writeActionQuery(args, insertSQL);
    }

    public static boolean addRoomQuery(int hotel_id, int beds, int price_per_day, int size) {
        Object[] args = {hotel_id, beds, price_per_day, size};

        //prepare SQL Query
        String insertSQL = "INSERT INTO rooms(hotel_id, beds, price_per_day, size) VALUES(?, ?, ?, ?);";

        return writeActionQuery(args, insertSQL);
    }

    public static boolean addBookingQuery(int guest_id, int room_id, String check_in, String check_out) {
        Object[] args = {guest_id, room_id, check_in, check_out};

        //prepare SQL Query
        String insertSQL = "INSERT INTO bookings(guest_id, room_id, check_in, check_out) VALUES(?, ?, ?, ?);";

        return writeActionQuery(args, insertSQL);
    }

    public static boolean addFeedbackQuery(int guest_id, int hotel_id, float rating, String review) {
        Object[] args = {guest_id, hotel_id, rating, review};

        String insertSQL = "INSERT INTO feedbacks(guest_id, hotel_id, rating, review) VALUES(?, ?, ?, ?)";

        return writeActionQuery(args, insertSQL);
    }

    public static boolean checkUsedHotelNameQuery(String name) {
        Object[] args = {name};

        String selectSQL = "SELECT COUNT(id) AS count_id FROM hotels WHERE name = ?";

        //returns true if given hotel name is USED by another hotel
        return writeCheckQuery(args, selectSQL);
    }

    public static boolean checkUsedGuestUsernameQuery(String username) {
        Object[] args = {username};

        String selectSQL = "SELECT COUNT(id) AS count_id FROM guests WHERE username = ?";

        //returns true if given username is USED by another hotel
        return writeCheckQuery(args, selectSQL);
    }

    // it returns id of given hotel, in case of failed query it returns -1

    public static int checkRegisteredHotelQuery(String name, String password) {
        Object[] args = {name, password};

        String selectSQL = "SELECT id FROM hotels WHERE name = ? AND password = ?";

        //check if hotel is already registered
        return (Integer)(writeGetQuery(args, selectSQL,"id", INTEGER));
    }

    // it returns id of given guest, in case of failed query it returns -1

    public static int checkRegisteredGuestQuery(String username, String password) {
        Object[] args = {username, password};

        String selectSQL = "SELECT id FROM guests WHERE username = ? AND password = ?";

        //check if guest is already registered
        return (Integer) (writeGetQuery(args, selectSQL,"id", INTEGER));
    }

    public static boolean checkRoomExistenceBeforeDeletingQuery(int room_id) {
        Object[] args = {room_id};

        String selectSQL = "SELECT COUNT(id) AS count_id FROM bookings WHERE room_id = ?";

        return writeCheckQuery(args, selectSQL);
    }

    public static int getHotelIDQuery(String hotelName) {
        Object[] args = {hotelName};

        String getSQL = "SELECT id FROM hotels WHERE name= ?";

        return (Integer)(writeGetQuery(args, getSQL, "id", INTEGER));

    }

    public static double getHotelServicesPriceQuery(String hotelName) {// need to handled
        // get id from hotel name
        Object[] args = {getHotelIDQuery(hotelName)};

        //prepare SQL statement
        String getSQL = "SELECT * AS service FROM services WHERE hotel_id = ?";

        return (Double)(writeGetQuery(args, getSQL, "service", DOUBLE));
    }

    public static double getAverageRatingOfHotelQuery(String hotelName) {
        // get id
        Object[] args = {getHotelIDQuery(hotelName)};

        String getSQL = "SELECT ROUND(AVG(rating),2) AS rating FROM feedbacks WHERE hotel_id = ? GROUP BY hotel_id";

        return (Double)(writeGetQuery(args, getSQL, "rating", DOUBLE));
    }


    // guest name, review, rating
    public static ArrayList<String[]> getFeedbackOfHotelQuery(int hotel_id) {
        Object[] args = {hotel_id};

        String getSQL = "SELECT * FROM feedbacks WHERE hotel_id = ?";

        ArrayList<String[]> feedbacks = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(getSQL);

            for (int i = 0; i < args.length; ++i) {
                ps.setInt(i + 1, (Integer)args[i]);
            }


            //check if row inserted correctly

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String review = rs.getString("review");
                String rating = rs.getString("rating");
                String guestName = getGuestNameByIDQuery(rs.getInt("guest_id"));
                feedbacks.add(new String[] {guestName, review, rating});
            }
            return feedbacks;
        } catch (SQLException e) {
            return null;
        }
    }


    public static int deleteRoomQuery(int hotelID, int roomID) {
        Object[] args = {roomID,hotelID};

        String deleteSQL = "DELETE FROM rooms WHERE id = ? AND hotel_id = ? AND id NOT IN(\n" +
                "  SELECT id FROM bookings\n" +
                ");";
        String checkQuery = "Select COUNT(id) as count_id from rooms where id = ? AND hotel_id = ?";

        if(writeActionQuery(args, deleteSQL))
            return 1;
        else{
            return (writeCheckQuery(args, checkQuery) ? 0 : -1);
        }
    }

    // it returns null in case of failed query, otherwise it returns the booking details of each room
    public static ArrayList<String[]> getBookedRoomsQuery(String hotelName) {
        Object[] args = {getHotelIDQuery(hotelName)};

        ArrayList<String[]> bookingDetails = new ArrayList<>();

        String getSQL = "SELECT * FROM bookings WHERE room_id IN(\n" +
                "    SELECT id FROM rooms WHERE hotel_id = ?\n" +
                "    )";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(getSQL);

            for (int i = 0; i < args.length; ++i) {
                ps.setInt(i + 1, (Integer) args[i]);
            }

            //get query response
            ResultSet rs = ps.executeQuery();

            //get query value

            while (rs.next()) {
                // organize column details in array
                String[] colDetails = {rs.getString("check_in"),
                        rs.getString("check_out"),
                        Integer.toString(rs.getInt("room_id")),
                        getGuestNameByIDQuery(rs.getInt("guest_id"))};

                // add booking details
                bookingDetails.add(colDetails);
            }
            return bookingDetails;
        } catch (SQLException e) {
            return null;
        }
    }



    /*
        return valid room in given period, returned as
        (hotel_name, room type, price)
     */
    public static ArrayList<Object[]> getValidRoomsInCertainPeriod(String check_in, String check_out) {
        String[] args = {check_in, check_in, check_in, check_out, check_in, check_out};

        ArrayList<Object[]> validRooms = new ArrayList<>();

        String getSQL = "SELECT * FROM rooms WHERE id NOT IN(\n" +
                "    SELECT room_id FROM bookings WHERE (check_in <= ? AND check_out > ?)\n" +
                "    OR (check_in >= ? AND check_in < ?)\n" +
                "    OR (check_out > ? AND check_out < ?)\n" +
                "    )";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(getSQL);

            for (int i = 0; i < args.length; ++i) {
                ps.setString(i + 1, args[i]);
            }

            //get query response
            ResultSet rs = ps.executeQuery();

            //get query value

            while (rs.next()) {
                // organize column details in array
                int hotel_id = rs.getInt("hotel_id");
                int room_id = rs.getInt("id");
                // add booking details
                validRooms.add(new Object[]{getHotelDetailsByIDQuery(hotel_id), getRoomByIDQuery(room_id)});
            }
            return validRooms;
        } catch (SQLException e) {
            return null;
        }
    }

    /*
        returns hotel name given its id
        return null in case failed query
     */
    public static String getHotelNameQuery(int hotelID) {
        Object[] args = {hotelID};


        String getSQL = "SELECT hotel_name FROM hotels WHERE hotel_id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(getSQL);

            for (int i = 0; i < args.length; ++i) {
                ps.setInt(i + 1, (Integer) args[i]);
            }

            //check if row inserted correctly

            ResultSet rs = ps.executeQuery();
            if(rs.next())
                return rs.getString("name");
            return
                    null;

        } catch (SQLException e) {
            return null;
        }
    }

    //query to find Room by its id, returns null in case of failed query
    public static Room getRoomByIDQuery(int id) {
        Object[] args = {id};


        String getSQL = "SELECT * FROM rooms WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(getSQL);

            for (int i = 0; i < args.length; ++i) {
                ps.setInt(i + 1, (Integer)args[i]);
            }

            //check if row inserted correctly

            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                int beds = rs.getInt("beds");
                int size = rs.getInt("size");
                int price_per_day = rs.getInt("price_per_day");
                return new Room(id, beds == 1 ? "single" : beds == 2 ? "double" : "triple", beds, size, price_per_day);
            }
            return null;
        } catch (SQLException e) {
            return null;
        }
    }


    public static Hotel getHotelDetailsByIDQuery(int hotel_id){
        Object[] args = {hotel_id};

        String getSQL = "SELECT * FROM hotels WHERE id = ?";


        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(getSQL);

            for (int i = 0; i < args.length; ++i) {
                ps.setInt(i + 1, (Integer)args[i]);
            }

            //check if row inserted correctly

            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                String username = rs.getString("name");
                String password = rs.getString("password");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String country = rs.getString("country");
                return new Hotel(username, password, hotel_id,address, country, city);
            }
            else
                return null;
        } catch (SQLException e) {
            return null;
        }
    }

    public static int getLastAddedRoomIDQuery(){
        String querySQL = "Select id from rooms order by id desc limit 1";


        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

            // prepare statement arguments
            PreparedStatement ps = conn.prepareStatement(querySQL);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                return rs.getInt("id");
            else
                return -1;
        }
        catch (Exception e){
            return -1;
        }
    }

    private static String getGuestNameByIDQuery(int guest_id){
        Object[] args = {guest_id};

        String getQuery = "SELECT username FROM guests WHERE id = ?";
        return (String) writeGetQuery(args, getQuery, "username", STRING);
    }

}
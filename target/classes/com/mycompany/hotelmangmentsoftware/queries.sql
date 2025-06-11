USE hbs;

-- query for getting number of hotels with the same name(for checking before registering)
--SELECT COUNT(id) AS count_id FROM hotels WHERE name = 'San Mia';

-- query for inserting new hotel
-- INSERT INTO hotels(address,city,country,name,password) VALUES ('Stanely','Alexandria','Egypt','San Mia','SanMia123');

-- query for getting number of users with the same username(for checking before registering)
--SELECT COUNT(id) AS count_id FROM guests WHERE username = 'zeyadsalah';

-- query for inserting new guest(register)
-- INSERT INTO guests(username,password) VALUES ('zeyadsalah','zeyadsalah123');

-- query to get the id of hotel of certain name
--SELECT id AS hotel_id FROM hotels WHERE name='San Mia';

-- query for checking login information for user
--SELECT COUNT(id) AS count_id FROM guests WHERE username = 'zeyadsalah' AND password = 'zeyadsalah123';

-- query for checking login information for hotel
--SELECT COUNT(id) AS count_id FROM hotels WHERE name = 'San Mia' AND password = 'SanMia123';

-- query for adding room
-- INSERT INTO rooms(hotel_id,beds,price_per_day,size) VALUES(1,3,100,24);

-- query for checking whether the room is booked or not before deleting
--SELECT COUNT(id) AS count_id FROM bookings WHERE room_id = 2;

-- query for deleting room
--DELETE FROM rooms WHERE id = 2;

-- query for searching for rooms
SELECT * FROM rooms WHERE beds = 3 AND size = 24 AND hotel_id = 1 AND price_per_day < 120 AND id NOT IN(
    SELECT room_id FROM bookings WHERE (check_in <= '2024-06-21' AND check_out > '2024-06-21')
    OR (check_in >= '2024-06-21' AND check_in < '2024-06-25')
    OR (check_out > '2024-06-21' AND check_out < '2024-06-25')
    );

-- search rooms in given period
--SELECT * FROM rooms WHERE id NOT IN(
--    SELECT room_id FROM bookings WHERE (check_in <= '2024-06-21' AND check_out > '2024-06-21')
--    OR (check_in >= '2024-06-21' AND check_in < '2024-06-25')
--    OR (check_out > '2024-06-21' AND check_out < '2024-06-25')
--    )

-- get room by id
--SELECT * FROM rooms WHERE room_id = 1;

-- get hotel name by id
--SELECT hotel_name FROM hotels WHERE hotel_id = 1

-- query for booking room
-- INSERT INTO bookings(guest_id,room_id,check_in,check_out) VALUES(1,1,'2024-06-22','2024-06-25');

-- query for getting services prices of certain hotel
--SELECT * AS service FROM services WHERE hotel_id = 1;

-- query for viewing bookings of certain hotel
--SELECT * FROM bookings WHERE room_id IN(
--    SELECT id FROM rooms WHERE hotel_id = 1
--    );

-- query for adding feedback
-- INSERT INTO feedbacks(guest_id,hotel_id,rating,review) VALUES(1,1,8.4,'It was good');

-- query to get average rating of certain hotel
--SELECT ROUND(AVG(rating),2) AS rating FROM feedbacks WHERE hotel_id = 1 GROUP BY hotel_id;

-- query to get reviews of certain hotel
--SELECT review FROM feedbacks WHERE hotel_id = 1;






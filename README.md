Here's the updated README file:

---

# Hotel Booking System

A simple hotel booking application with a graphical user interface (GUI) built using Java Swing. It allows users to search and book available rooms in hotels. Hotel admins can manage rooms and view booking details.

## Features

- **User Functionality:** 
  - Search for available rooms within a specified period.
  - Book rooms that are not already booked.

- **Admin Functionality:** 
  - Register on the application.
  - Add, delete, or update room details.
  - View booking details and associated periods.

## Technologies Used

- **Backend:** Vanilla Java 17
- **Database:** MySQL
- **Frontend:** JavaSwing

## Installation and Running

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/Ahmed-waled/HotelManagmentSoftware
   cd HotelManagmentSoftware
   ```

3. **Configure Database:**

   - Ensure your MySQL Server is running and configured correctly (least suitable version is `8.0`)
   - Go to `DatabaseManagement.java` in the src folder
   - update the fields `DB_URL`, `USER`, `PASS` with your credintials.

6. **Run the Application:**
    ```java -cp "target/classes;lib/mysql-connector-j-8.4.0.jar;lib/unknown/binary/KGradientPanel/SNAPSHOT/KGradientPanel-SNAPSHOT.jar" com.mycompany.hotelmangmentsoftware.Home_Page```

## Requirements

- Java 17 or higher version
- MySQL Server 8.0 or higher version

## Usage

- **User Interface:**
  - Launch the application to access the GUI.
  - Log in as a guest (register first in case new user)
  - Enter the desired booking period to search for available rooms.
  - Choose a suitable room to book.

- **Admin Interface:**
  - Register to access admin features.
  - Manage room details and view booking information.

## Contributors
  - [Ahmed Waled](www.github.com/Ahmed-waled)
  - [Zeyad Salah](www.github.com/zeyadsalah22)
  - [Mostafa Younes](www.github.com/Shift118)
## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License.


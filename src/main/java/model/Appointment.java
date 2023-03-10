package model;

import java.security.Timestamp;
import java.util.Date;

public class Appointment extends Timestamped {

    private int id;                         // Appointment_ID INT(10) (PK)
    private String title;                   // Title VARCHAR(50)
    private String description;             // Description VARCHAR(50)
    private String location;                // Location VARCHAR(50)
    private String type;                    // Type VARCHAR(50)
    private Date start;                     // Start DATETIME
    private Date end;                       // End DATETIME
    private Customer customer;              // Customer_ID INT(10) (FK)
    private User user;                      // User_ID INT(10) (FK)
    private Contact contact;                // Contact_ID INT(10) (FK)
}

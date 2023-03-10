package model;

import java.security.Timestamp;
import java.util.Date;

public class Appointment {

    private int id;                         // Appointment_ID INT(10) (PK)
    private String title;                   // Title VARCHAR(50)
    private String description;             // Description VARCHAR(50)
    private String location;                // Location VARCHAR(50)
    private String type;                    // Type VARCHAR(50)
    private Date start;                     // Start DATETIME
    private Date end;                       // End DATETIME
    private Date createdDate;               // Created_Date DATETIME
    private String createdBy;               // Created_By VARCHAR(50)
    private Timestamp lastUpdate;           // Last_Update TIMESTAMP
    private String lastUpdatedBy;           // Last_Updated_By VARCHAR(50)
    private Customer customer;              // Customer_ID INT(10) (FK)
    private User user;                      // User_ID INT(10) (FK)
    private Contact contact;                // Contact_ID INT(10) (FK)
}

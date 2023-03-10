package model;

import java.security.Timestamp;
import java.util.Date;

public class Customer {

    private int id;                 // Customer_ID INT(10) (PK)
    private String name;            // Customer_Name VARCHAR(50)
    private String address;                 // Address VARCHAR(100)
    private String postalCode;              // Postal_Code VARCHAR(50)
    private String phoneNumber;             // Phone VARCHAR(50)
    private Date createdDate;               // Created_Date DATETIME
    private String createdBy;               // Created_By VARCHAR(50)
    private Timestamp lastUpdate;           // Last_Update TIMESTAMP
    private String lastUpdatedBy;           // Last_Updated_By VARCHAR(50)
    private Division division;              // Division_ID INT(10) (FK)
}

package model;

import java.security.Timestamp;
import java.util.Date;

public class Customer extends Timestamped {

    private int id;                 // Customer_ID INT(10) (PK)
    private String name;            // Customer_Name VARCHAR(50)
    private String address;                 // Address VARCHAR(100)
    private String postalCode;              // Postal_Code VARCHAR(50)
    private String phoneNumber;             // Phone VARCHAR(50)
    private Division division;              // Division_ID INT(10) (FK)
}

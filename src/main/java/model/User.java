package model;

import java.security.Timestamp;
import java.util.Date;

public class User extends Timestamped {

    private int id;                     // User_ID INT(10) (PK)
    private String name;                // User_Name VARCHAR(50) UNIQUE
    private String password;                // Password TEXT
}

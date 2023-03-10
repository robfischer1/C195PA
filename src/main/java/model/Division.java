package model;

import java.security.Timestamp;
import java.util.Date;

public class Division extends Timestamped {
    private int id;                 // Division_ID INT(10) (PK)
    private String name;            // Division VARCHAR(50)
    private Country country;                // Country_ID INT(10) (FK)
}

package model;

import java.security.Timestamp;
import java.util.Date;

public class Division {
    private int id;                 // Division_ID INT(10) (PK)
    private String name;            // Division VARCHAR(50)
    private Date createdDate;               // Created_Date DATETIME
    private String createdBy;               // Created_By VARCHAR(50)
    private Timestamp lastUpdate;           // Last_Update TIMESTAMP
    private String lastUpdatedBy;           // Last_Updated_By VARCHAR(50)
    private Country country;                // Country_ID INT(10) (FK)
}

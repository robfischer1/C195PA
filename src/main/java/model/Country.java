package model;

import java.security.Timestamp;
import java.util.Date;

public class Country {
    private int id;                  // Country_ID INT(10) (PK)
    private String name;             // Country VARCHAR(50)
    private Date createdDate;               // Created_Date DATETIME
    private String createdBy;               // Created_By VARCHAR(50)
    private Timestamp lastUpdate;           // Last_Update TIMESTAMP
    private String lastUpdatedBy;           // Last_Updated_By VARCHAR(50)
}

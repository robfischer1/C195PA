package model;

import java.security.Timestamp;
import java.util.Date;

public class Timestamped {
    private Date createdDate;               // Created_Date DATETIME
    private String createdBy;               // Created_By VARCHAR(50)
    private Timestamp lastUpdate;           // Last_Update TIMESTAMP
    private String lastUpdatedBy;           // Last_Updated_By VARCHAR(50)
}

module org.robfischer.c195pa {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.robfischer.c195pa to javafx.fxml;
    exports org.robfischer.c195pa;
}
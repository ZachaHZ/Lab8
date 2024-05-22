module org.example.lab8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab8 to javafx.fxml;
    exports org.example.lab8;
}
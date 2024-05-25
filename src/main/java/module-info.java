module ucr.lab{
//    requires javafx.controls;
//    requires javafx.fxml;
//    requires java.desktop;
//
//    exports ucr.lab;
    requires javafx.controls;
    requires javafx.fxml;


    opens ucr.lab to javafx.fxml;
    exports ucr.lab;
    exports controller;
    opens controller to javafx.fxml;


    //opens org.example.lab8 to javafx.fxml;
    // exports org.example.lab8; //I don't know why is this here, but it was causing bugs
}
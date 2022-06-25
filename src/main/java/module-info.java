module com.example.javafxtasklist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.javafxtasklist to javafx.fxml;
    exports com.example.javafxtasklist;
}
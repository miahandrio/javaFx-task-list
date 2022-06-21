module com.example.javafxtasklist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtasklist to javafx.fxml;
    exports com.example.javafxtasklist;
}
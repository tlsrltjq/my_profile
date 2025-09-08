module com.example.my_profile {
    requires javafx.controls;
    requires javafx.fxml;
    requires javax.servlet.api;


    opens com.example.my_profile to javafx.fxml;
    exports com.example.my_profile;
}
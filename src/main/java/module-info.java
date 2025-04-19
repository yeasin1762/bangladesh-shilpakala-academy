module com.example.bangladeshshilpakalaacademy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bangladeshshilpakalaacademy to javafx.fxml;
    exports com.example.bangladeshshilpakalaacademy;
}
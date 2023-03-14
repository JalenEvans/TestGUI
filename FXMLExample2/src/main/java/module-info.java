module com.example.fxmlexample2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmlexample2 to javafx.fxml;
    exports com.example.fxmlexample2;
}
module com.example.in2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.in2 to javafx.fxml;
    exports com.example.in2;
}
module com.example.lenim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lenim to javafx.fxml;
    exports com.example.lenim;
}
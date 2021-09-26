module com.example.lab4_var11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lab4_var11 to javafx.fxml;
    exports com.example.lab4_var11;
}
module com.ryuu.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ryuu.demo to javafx.fxml;
    exports com.ryuu.demo;
}
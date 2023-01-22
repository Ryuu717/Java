module com.ryuu.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.ryuu.demo to javafx.fxml;
    exports com.ryuu.demo;
}
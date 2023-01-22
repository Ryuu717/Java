module com.ryuu.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ryuu.demo to javafx.fxml;
    exports com.ryuu.demo;

    //Open Database
    opens com.ryuu.demo.model;
}
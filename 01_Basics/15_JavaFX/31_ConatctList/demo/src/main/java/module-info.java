module com.ryuu.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.ryuu.demo to javafx.fxml;
    exports com.ryuu.demo;

    //Added
    opens com.ryuu.demo.datamodel;
}
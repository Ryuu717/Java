module com.ryuu.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;


    opens com.ryuu.demo to javafx.fxml;
    exports com.ryuu.demo;
}
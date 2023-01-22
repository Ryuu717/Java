module com.ryuu.uiscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ryuu.uiscenebuilder to javafx.fxml;
    exports com.ryuu.uiscenebuilder;
}
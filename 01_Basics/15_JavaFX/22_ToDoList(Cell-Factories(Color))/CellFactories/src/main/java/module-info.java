module com.ryuu.cellfactories {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ryuu.cellfactories to javafx.fxml;
    exports com.ryuu.cellfactories;
}
module com.ryuu.borderpanelayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ryuu.borderpanelayout to javafx.fxml;
    exports com.ryuu.borderpanelayout;
}
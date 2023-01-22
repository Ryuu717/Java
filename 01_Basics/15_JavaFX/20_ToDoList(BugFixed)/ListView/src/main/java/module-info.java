module com.ryuu.listview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ryuu.listview to javafx.fxml;
    exports com.ryuu.listview;
}
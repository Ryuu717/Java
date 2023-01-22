module com.ryuu.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.ryuu.demo to javafx.fxml;
    exports com.ryuu.demo;
}
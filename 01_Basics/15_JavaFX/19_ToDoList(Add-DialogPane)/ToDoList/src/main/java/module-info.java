module com.ryuu.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ryuu.todolist to javafx.fxml;
    exports com.ryuu.todolist;
}
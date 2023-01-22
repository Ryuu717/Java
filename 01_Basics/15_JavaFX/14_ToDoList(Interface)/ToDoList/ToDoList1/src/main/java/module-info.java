module com.ryuu.todolist1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ryuu.todolist1 to javafx.fxml;
    exports com.ryuu.todolist1;
}
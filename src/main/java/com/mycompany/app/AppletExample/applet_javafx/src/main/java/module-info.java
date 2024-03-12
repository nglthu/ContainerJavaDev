module com.mycompany.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.app to javafx.fxml;
    exports com.mycompany.app;
}

module com.smritipokhrel.healthmonitoringsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires servlet.api;
    requires org.json;
    requires java.sql;
    requires javafx.base;

    opens com.smritipokhrel.healthmonitoringsystem to javafx.fxml;
    exports com.smritipokhrel.healthmonitoringsystem;

    opens com.smritipokhrel.healthmonitoringsystem.classes to javafx.base;
    exports com.smritipokhrel.healthmonitoringsystem.classes;
}
module com.shajid.app.smart_retail_inventory_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.shajid.app.smart_retail_inventory_system to javafx.fxml;
    opens com.shajid.app.smart_retail_inventory_system.controller to javafx.fxml;

    exports com.shajid.app.smart_retail_inventory_system;
}

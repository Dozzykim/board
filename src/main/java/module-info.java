module com.joeun {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.joeun to javafx.fxml, java.sql;
    exports com.joeun;
}

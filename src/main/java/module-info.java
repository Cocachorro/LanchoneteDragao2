module com.lanchonetedragao2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.lanchonetedragao2 to javafx.fxml;
    exports com.lanchonetedragao2;
}
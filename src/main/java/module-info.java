module com.lanchonetedragao2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lanchonetedragao2 to javafx.fxml;
    exports com.lanchonetedragao2;
}
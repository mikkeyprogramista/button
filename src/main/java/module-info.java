module com.adz1q.button {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adz1q.button to javafx.fxml;
    exports com.adz1q.button;
}
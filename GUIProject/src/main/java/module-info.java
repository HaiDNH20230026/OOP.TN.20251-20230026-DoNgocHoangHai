module com.hust.kstn.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.hust.kstn.javafx to javafx.fxml;
    exports com.hust.kstn.javafx;
}
module es.masanz.ut4.ajedrez.app {
    requires javafx.controls;
    requires javafx.fxml;

    exports es.masanz.ut4.ajedrez.util;
    exports es.masanz.ut4.ajedrez.app;

    opens es.masanz.ut4.ajedrez.util to javafx.fxml;
    opens es.masanz.ut4.ajedrez.app to javafx.fxml;
}
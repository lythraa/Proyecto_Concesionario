module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.model to javafx.fxml;
    exports co.edu.uniquindio.poo.model;
}

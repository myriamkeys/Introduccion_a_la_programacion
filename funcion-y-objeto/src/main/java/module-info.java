module com.open_bootcamp.funcionyobjeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.open_bootcamp.funcionyobjeto to javafx.fxml;
    exports com.open_bootcamp.funcionyobjeto;
}
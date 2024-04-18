module com.example.defgitjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.defgitjava to javafx.fxml;
    exports com.example.defgitjava;
}
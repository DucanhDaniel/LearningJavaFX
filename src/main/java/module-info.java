module jfx.learnjfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens jfx.learnjfx to javafx.fxml;
    exports jfx.learnjfx;
}
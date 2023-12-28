module io.ianskelskey.wizard {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens io.ianskelskey.wizard to javafx.fxml;
    exports io.ianskelskey.wizard;
}
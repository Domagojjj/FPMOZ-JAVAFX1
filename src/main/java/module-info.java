module ba.sum.fpmoz.informatika.fpmozjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.kordamp.bootstrapfx.core;


    opens ba.sum.fpmoz.informatika.fpmozjavafx to javafx.fxml;
    opens ba.sum.fpmoz.informatika.fpmozjavafx.model to javafx.fxml;
    exports ba.sum.fpmoz.informatika.fpmozjavafx;
    exports ba.sum.fpmoz.informatika.fpmozjavafx.controller;
    exports ba.sum.fpmoz.informatika.fpmozjavafx.model;
    opens ba.sum.fpmoz.informatika.fpmozjavafx.controller to javafx.fxml;
}
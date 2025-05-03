module org.example.lesson17_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lesson17_2 to javafx.fxml;
    exports org.example.lesson17_2;
}
package com.adz1q.button;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private Button btnClick;

    @FXML
    private Label lblInfo;

    @FXML
    private Button btnClose;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnClose.setOnAction(actionEvent -> Platform.exit());
        btnClick.setOnAction(actionEvent -> {
            btnClick.setText("Try again!");
            lblInfo.setVisible(false);
            generateRandomPosition(btnClick);
        });
        btnClose.setOnMouseEntered(actionEvent -> {
            generateRandomPosition(btnClose);
        });
    }

    private void generateRandomPosition(Button btn) {
        double maxWidth = pane.getWidth() - btn.getWidth();
        double maxHeight = pane.getHeight() - btn.getHeight();

        double x = Math.random() * maxWidth;
        double y = Math.random() * maxHeight;

        btn.setLayoutX(x);
        btn.setLayoutY(y);
    }
}

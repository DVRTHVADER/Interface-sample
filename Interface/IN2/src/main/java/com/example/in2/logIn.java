package com.example.in2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import javafx.scene.text.Text;

public class logIn {

    @FXML
    private Text Welcome;
    @FXML
    private AnchorPane Login;

    @FXML
    void OnBackc(ActionEvent event)throws IOException {
        new sceneswitch(Login,"hello-view.fxml");

    }

    @FXML
    void OnNextC(ActionEvent event) {

    }

}

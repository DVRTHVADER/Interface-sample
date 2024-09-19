package com.example.in2;

import com.example.in2.HelloApplication;
import javafx.fxml.FXMLLoader;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class sceneswitch {
    public sceneswitch(AnchorPane currentAnchorPane, String fxml) throws IOException {
       AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);

    }
}

//It is a Sample Dating App Interface, oops 😁
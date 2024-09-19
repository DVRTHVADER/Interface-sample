package com.example.in2;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;


import com.example.in2.HelloApplication;
import javafx.fxml.FXMLLoader;


import java.io.IOException;
import java.util.Objects;

public class sceneswitch2{
public void sceneswitch(AnchorPane currentAnchorPane, String fxml) throws IOException {
    if (currentAnchorPane == null) {
        throw new IllegalArgumentException("currentAnchorPane must not be null");
    }

    AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxml)));

    if (nextAnchorPane != null) {
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);
    } else {
        throw new IOException("Failed to load the FXML file: " + fxml);
    }
}}

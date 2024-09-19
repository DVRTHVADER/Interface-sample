package com.example.in2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class HomeviewControl {

    @FXML
    private AnchorPane HV;

    @FXML
    private Button lout;

    @FXML
    void LogtoHome(ActionEvent event)throws IOException {
        new sceneswitch(HV,"hello-view.fxml");
    }

}
/*package com.example.in2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeviewControl {

    @FXML
    private Button lout;
    priva

    @FXML
    void LogtoHome(ActionEvent event) {
        new sceneswitch(Login,"hello-view.fxml");
    }

}*/

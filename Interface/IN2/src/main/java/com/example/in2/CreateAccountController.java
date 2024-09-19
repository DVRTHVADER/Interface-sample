package com.example.in2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import java.time.LocalDate;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
public class CreateAccountController {

    @FXML
    private TextField A;

    @FXML
    private TextField B;

    @FXML
    private DatePicker C;

    @FXML
    private AnchorPane CreateAccp;

    @FXML
    private PasswordField D;

    @FXML
    private PasswordField E;

    @FXML
    void onResetClick(ActionEvent event) {
        A.setText("");
        B.setText("");
        C.setValue(null);
        D.setText("");
        E.setText("");
    }

    @FXML
    void onSubmitClick(ActionEvent event)throws IOException {
        new sceneswitch(CreateAccp,"Home-view.fxml");
    }
    @FXML
    void onBackClick(ActionEvent event)throws IOException {
        new sceneswitch(CreateAccp,"hello-view.fxml");
    }
}
/* // Create a new user with the input data
        User newUser = new User(name, dob, gender, password);

        // Add the new user to the ArrayList or perform any other desired action
        // userList.add(newUser);

        // Close the create account interface
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }*/

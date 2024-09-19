package com.example.in2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private AnchorPane Scene1AP;

    @FXML
    private Button createAccountButton;

    @FXML
    private Button loginButton;

    @FXML
    void onCreateAccountClick(ActionEvent event)throws IOException {
    new sceneswitch(Scene1AP,"CreateAccount-view.fxml");
    }
    @FXML
    public void onLoginc() throws IOException {
        // Load the login FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Parent root = fxmlLoader.load();

        // Get the current window from the login button's scene
        Stage window = (Stage) loginButton.getScene().getWindow();

        // Create a new scene with the loaded root and set it to the window
        Scene scene = new Scene(root);
        window.setScene(scene);
    }


}






 /*   @FXML
    private void handleCreateAccount() {
        try {
            FXMLLoader createAccountLoader = new FXMLLoader(getClass().getResource("createAccountInterface.fxml"));
            Scene createAccountScene = new Scene(createAccountLoader.load());
            Stage createAccountStage = new Stage();
            createAccountStage.setTitle("Create Account");
            createAccountStage.setScene(createAccountScene);
            createAccountStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


package com.example.in2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}*/
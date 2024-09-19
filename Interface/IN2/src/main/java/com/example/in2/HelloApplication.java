package com.example.in2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {

    private static FXMLLoader createAccountLoader;
    private static FXMLLoader loginLoader;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("background.css").toExternalForm());
        stage.setTitle("Welcome To Link!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void showCreateAccountInterface() {
        try {
            if (createAccountLoader == null) {
                URL location = HelloApplication.class.getResource("~/CreateAccountInterface.fxml");
                if (location == null) {
                    throw new IOException("FXML file not found");
                }
                createAccountLoader = new FXMLLoader(location);
                Parent root = createAccountLoader.load();

                // Set the controller for the loaded FXML
                createAccountLoader.setController(new CreateAccountController());

                Stage createAccountStage = new Stage();
                createAccountStage.setScene(new Scene(root));
                createAccountStage.setTitle("Create Account");
                createAccountStage.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showLoginInterface(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }
    public void showHomeView(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home-view.fxml"));
        stage.getScene().setRoot(root);
        stage.show();
    }}








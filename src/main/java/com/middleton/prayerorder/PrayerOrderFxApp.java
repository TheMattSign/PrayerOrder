package com.middleton.prayerorder;

import com.middleton.prayerorder.controllers.AbstractController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrayerOrderFxApp extends Application {

    public static final String VERSION = "v1.00";

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setHeight(435);
        this.primaryStage.setWidth(650);
        this.primaryStage.setTitle("Night time routine");

        loadScreen("prayerorder.fxml");
    }

    public void loadScreen(String resourceName) throws IOException {
        if (!resourceName.startsWith("/")) {
            resourceName = "/" + resourceName;
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource(resourceName));
        Parent root = loader.load();

        AbstractController abstractController = loader.getController();
        abstractController.setPrayerOrderFxApp(this);

        this.primaryStage.setScene(new Scene(root, 1000, 1000));
        this.primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}

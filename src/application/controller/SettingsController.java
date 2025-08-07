package application.controller;

import java.io.IOException;

import application.MoveBetweenScenes;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
//import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.stage.Screen;
import javafx.stage.Stage;

public class SettingsController implements MoveBetweenScenes{
	
	private Parent root;
	private Stage stage;
	private Scene scene;
		
	public void switchToHome(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
		//Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		scene = new Scene(root);//,primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight());
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//scene.setFill(Color.AQUA);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.setTitle("Settings");
		stage.show();
	}
	
	
}

package application.controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
//import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class MainController {
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	public void switchToSettings(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("fxml/settings.fxml"));
		//Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		scene = new Scene(root);//,primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight());
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//scene.setFill(Color.AQUA);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.setTitle("Settings");
		stage.show();
	}
	public void switchToStock(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("fxml/stock.fxml"));
		//Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		scene = new Scene(root);//,primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight());
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//scene.setFill(Color.AQUA);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.setTitle("Stock");
		stage.show();
	}
	public void switchToSales(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("fxml/sales.fxml"));
		//Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		scene = new Scene(root);//,primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight());
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.setTitle("Sales");
		stage.show();
	}
	public void switchToFinances(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("fxml/finances.fxml"));
		//Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
		scene = new Scene(root);//,primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight());
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//scene.setFill(Color.AQUA);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.setTitle("Finances");
		stage.show();
	}
}

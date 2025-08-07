package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(Main.class.getResource("controller/fxml/main.fxml"));
			//Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
			Scene scene = new Scene(root);//,primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight());
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//scene.setFill(Color.AQUA);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Home");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

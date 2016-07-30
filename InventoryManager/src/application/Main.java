package application;
 
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	public String username;
	public String password;
	public ArrayList<String> usernames = new ArrayList<String>();
	public ArrayList<String> passwords = new ArrayList<String>();
	
	public void start(Stage primaryStage) {
	
		try {
//			BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("/application/InventoryManager.fxml"));
			Scene scene = new Scene(root, 751, 754);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Inventory Manager");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

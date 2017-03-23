package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage)throws Exception{

		try {
			Parent root=FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Stage primaryStage11= new Stage() ;
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage11.setScene(scene);
			primaryStage11.show();
			
			} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SorryController {
	@FXML
	public void ContinueToTheNextStudent(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Level04.fxml"));
		Scene scene = new Scene(root);
		Stage nexttoSorry = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		nexttoSorry.setScene(scene);
		nexttoSorry.show();
	}
}

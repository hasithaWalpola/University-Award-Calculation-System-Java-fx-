package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiplomaController {
	public void DiplomaContinue(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/application/Level04.fxml"));
		Scene scene = new Scene(root);
		Stage nexttoLogIn = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		nexttoLogIn.setScene(scene);
		nexttoLogIn.show();
	}
}
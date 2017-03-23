package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AwardsController {
	@FXML
	private Label AwardsMessage;

	public static double getGetAverages() {
		return getAverages;
	}

	public static void setGetAverages(double number) {
		AwardsController.getAverages = number;
	}

	public static double getAverages;

	public void AwardsController() {
		AwardsController award = new AwardsController();
		award.getGetAverages();

		if (getAverages >= 0 && getAverages <= 100) {
			if (getAverages >= 70) {
				AwardsMessage.setText("1st class Honour");
			} else if (getAverages >= 60) {
				AwardsMessage.setText("2nd class Honours Upper Division");
			} else if (getAverages >= 50) {
				AwardsMessage.setText("2nd class Honours Lower Division");
			} else if (getAverages >= 40) {
				AwardsMessage.setText("3rd class Honours ");
			}
		}
	}
	@FXML
	public void AgainToTheNextStudent(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Level04.fxml"));
		Scene scene = new Scene(root);
		Stage nexttoSorry = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		nexttoSorry.setScene(scene);
		nexttoSorry.show();
	}
}

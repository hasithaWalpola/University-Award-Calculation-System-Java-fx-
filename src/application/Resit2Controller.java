package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class Resit2Controller {
	int resit2Credits = 0;
	@FXML
	private TextField Resit2ICT11, Resit2ICT21, Resit2ICT31, Resit2ICT12, Resit2ICT22, Resit2ICT32, Resit2CW1,
			Resit2CW2, Resit2CW3;
	@FXML
	private Label Resit2T1, Resit2T2, Resit2T3, Resit2PF1, Resit2PF2, Resit2PF3;
	@FXML
	private Button L5Continue;
	@FXML
	private TextField Resit2NoOfModules;

	public void Resit2CalculateResults(ActionEvent event) {
		ArrayList<Integer> Resit2Marks = new ArrayList<>();
		// Getting ICT and CW marks and calculate the average marks
		Resit2Marks.add((Integer.parseInt(Resit2ICT11.getText()) + Integer.parseInt(Resit2ICT12.getText())
				+ Integer.parseInt(Resit2CW1.getText())) / 3);
		Resit2Marks.add((Integer.parseInt(Resit2ICT21.getText()) + Integer.parseInt(Resit2ICT22.getText())
				+ Integer.parseInt(Resit2CW2.getText())) / 3);
		Resit2Marks.add((Integer.parseInt(Resit2ICT31.getText()) + Integer.parseInt(Resit2ICT32.getText())
				+ Integer.parseInt(Resit2CW3.getText())) / 3);
		int index4 = 0;
		for (int Val : Resit2Marks) {
			if (Val >= 40) {
				switch (index4) {
				case 0:
					Resit2PF1.setText("Pass");
					Resit2T1.setText(String.valueOf(Val));
					index4++;
					break;
				case 1:
					Resit2PF2.setText("Pass");
					Resit2T2.setText(String.valueOf(Val));
					index4++;
					break;
				case 2:
					Resit2PF3.setText("Pass");
					Resit2T3.setText(String.valueOf(Val));
					index4++;
					break;
				}
			} else {
				switch (index4) {
				case 0:
					Resit2PF1.setText("Fail");
					Resit2T1.setText(String.valueOf(Val));
					index4++;
					break;
				case 1:
					Resit2PF2.setText("Fail");
					Resit2T2.setText(String.valueOf(Val));
					index4++;
					break;
				case 2:
					Resit2PF3.setText("Fail");
					Resit2T3.setText(String.valueOf(Val));
					index4++;
					break;
				}
			}
		}
		for (int val2 : Resit2Marks) {
			if (val2 > 40) {
				resit2Credits += 20;

			}
			System.out.println(resit2Credits);
		}
	}

	public void Resit2Continue(ActionEvent event) throws IOException {
		if (Resit2NoOfModules.getText().equals("1")) {
			if (resit2Credits == 20) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/level06.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			} else {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Diploma.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			}

		} else if (Resit2NoOfModules.getText().equals("2")) {
			if (resit2Credits == 40) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/level06.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			} else {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Diploma.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			}
		} else if (Resit2NoOfModules.getText().equals("3")) {
			if (resit2Credits == 60) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/level06.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			} else {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Diploma.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			}
		}
	}

	public void Resit2Exit(ActionEvent event) throws IOException {
		if (Resit2NoOfModules.getText().equals("1")) {
			if (resit2Credits == 20) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/CetDip.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			} else {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Sorry.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			}

		} else if (Resit2NoOfModules.getText().equals("2")) {
			if (resit2Credits == 40) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/CetDip.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			} else {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Sorry.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			}
		} else if (Resit2NoOfModules.getText().equals("3")) {
			if (resit2Credits == 40) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/CetDip.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			} else {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Sorry.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			}
		}
	}
}

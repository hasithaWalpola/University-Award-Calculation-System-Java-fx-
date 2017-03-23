package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class Resit1Controller {
	int resit1Credits = 0;
	@FXML
	private TextField Resit1ICT11, Resit1ICT21, Resit1ICT31, Resit1ICT12, Resit1ICT22, Resit1ICT32, Resit1CW1,
			Resit1CW2, Resit1CW3, Resit1NoOfModules;
	@FXML
	private Label Resit1T1, Resit1T2, Resit1T3, Resit1PF1, Resit1PF2, Resit1PF3;
	@FXML
	private Button L5Continue;

	@FXML
	public void Resit1CalculateResults(ActionEvent event) {
		ArrayList<Integer> Resit1Marks = new ArrayList<>();
		// Getting ICT and CW marks and calculate the average marks
		Resit1Marks.add((Integer.parseInt(Resit1ICT11.getText()) + Integer.parseInt(Resit1ICT12.getText())
				+ Integer.parseInt(Resit1CW1.getText())) / 3);
		Resit1Marks.add((Integer.parseInt(Resit1ICT21.getText()) + Integer.parseInt(Resit1ICT22.getText())
				+ Integer.parseInt(Resit1CW2.getText())) / 3);
		Resit1Marks.add((Integer.parseInt(Resit1ICT31.getText()) + Integer.parseInt(Resit1ICT32.getText())
				+ Integer.parseInt(Resit1CW3.getText())) / 3);
		int index4 = 0;
		for (int Val : Resit1Marks) {
			if (Val >= 40) {
				switch (index4) {
				case 0:
					Resit1PF1.setText("Pass");
					Resit1T1.setText(String.valueOf(Val));
					index4++;
					break;
				case 1:
					Resit1PF2.setText("Pass");
					Resit1T2.setText(String.valueOf(Val));
					index4++;
					break;
				case 2:
					Resit1PF3.setText("Pass");
					Resit1T3.setText(String.valueOf(Val));
					index4++;
					break;
				}
			} else {
				switch (index4) {
				case 0:
					Resit1PF1.setText("Fail");
					Resit1T1.setText(String.valueOf(Val));
					index4++;
					break;
				case 1:
					Resit1PF2.setText("Fail");
					Resit1T2.setText(String.valueOf(Val));
					index4++;
					break;
				case 2:
					Resit1PF3.setText("Fail");
					Resit1T3.setText(String.valueOf(Val));
					index4++;
					break;
				}
			}
		}
		for (int val2 : Resit1Marks) {
			if (val2 > 40) {
				resit1Credits += 20;
			}
		}
	}

	public void Resit2Continue(ActionEvent event) throws Exception {
		if (Resit1NoOfModules.getText().equals("1")) {
			if (resit1Credits == 20) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/level06.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			} else {
				Parent root = FXMLLoader.load(getClass().getResource("/application/CetDip.fxml"));
				Scene scene = new Scene(root);
				Stage nexttoResit = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				nexttoResit.setScene(scene);
				nexttoResit.show();
			}

		} else if (Resit1NoOfModules.getText().equals("2")) {
			if (resit1Credits == 40) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/level05.fxml"));
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
		} else if (Resit1NoOfModules.getText().equals("3")) {
			if (resit1Credits == 60) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/level05.fxml"));
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

	public void Resit2Exit(ActionEvent event) throws Exception {
		if (Resit1NoOfModules.getText().equals("1")) {
			if (resit1Credits == 20) {
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

		} else if (Resit1NoOfModules.getText().equals("2")) {
			if (resit1Credits == 40) {
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
		} else if (Resit1NoOfModules.getText().equals("3")) {
			if (resit1Credits == 40) {
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
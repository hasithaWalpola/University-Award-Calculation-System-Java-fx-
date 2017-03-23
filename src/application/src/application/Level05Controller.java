package application;

import java.util.ArrayList;
import java.util.Collections;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Level05Controller {
	int l5Credits = 0;
	public static int minimumLevel05;
	public static int totalLevel05;
	@FXML
	private TextField L5ICT11, L5ICT21, L5ICT31, L5ICT41, L5ICT51, L5ICT61, L5ICT12, L5ICT22, L5ICT32, L5ICT42, L5ICT52,
			L5ICT62, L5CW1, L5CW2, L5CW3, L5CW4, L5CW5, L5CW6;
	public static int getTotalLevel05() {
		return totalLevel05;
	}
	@FXML
	private Label L5T1, L5T2, L5T3, L5T4, L5T5, L5T6, L5PF1, L5PF2, L5PF3, L5PF4, L5PF5, L5PF6, L5Repeat1, L5Repeat2;
	@FXML
	private Button L5CalRe, L5Exit, L5Continue;

	// Event Listener on Button.onAction
	@FXML
	public void L5CalRe(ActionEvent event) {
		ArrayList<Integer> L5Marks = new ArrayList<>();
		// Getting ICT and CW marks and calculate the average marks
		L5Marks.add((Integer.parseInt(L5ICT11.getText()) + Integer.parseInt(L5ICT12.getText())
				+ Integer.parseInt(L5CW1.getText())) / 3);
		L5Marks.add((Integer.parseInt(L5ICT21.getText()) + Integer.parseInt(L5ICT22.getText())
				+ Integer.parseInt(L5CW2.getText())) / 3);
		L5Marks.add((Integer.parseInt(L5ICT31.getText()) + Integer.parseInt(L5ICT32.getText())
				+ Integer.parseInt(L5CW3.getText())) / 3);
		L5Marks.add((Integer.parseInt(L5ICT41.getText()) + Integer.parseInt(L5ICT42.getText())
				+ Integer.parseInt(L5CW4.getText())) / 3);
		L5Marks.add((Integer.parseInt(L5ICT51.getText()) + Integer.parseInt(L5ICT52.getText())
				+ Integer.parseInt(L5CW5.getText())) / 3);
		L5Marks.add((Integer.parseInt(L5ICT61.getText()) + Integer.parseInt(L5ICT62.getText())
				+ Integer.parseInt(L5CW6.getText())) / 3);
		/*
		 * To check whether the modules are passed of failed and to get credits
		 * to passed ones
		 */
		int index2 = 0;
		for (int Val : L5Marks) {
			if (Val >= 40) {
				switch (index2) {
				case 0:
					L5PF1.setText("Pass");
					L5T1.setText(String.valueOf(Val));
					index2++;
					break;
				case 1:
					L5PF2.setText("Pass");
					L5T2.setText(String.valueOf(Val));
					index2++;
					break;
				case 2:
					L5PF3.setText("Pass");
					L5T3.setText(String.valueOf(Val));
					index2++;
					break;
				case 3:
					L5PF4.setText("Pass");
					L5T4.setText(String.valueOf(Val));
					index2++;
					break;
				case 4:
					L5PF5.setText("Pass");
					L5T5.setText(String.valueOf(Val));
					index2++;
					break;
				case 5:
					L5PF6.setText("Pass");
					L5T6.setText(String.valueOf(Val));
					index2++;
					break;
				}
			} else {
				switch (index2) {
				case 0:
					L5PF1.setText("Fail");
					L5T1.setText(String.valueOf(Val));
					index2++;
					break;
				case 1:
					L5PF2.setText("Fail");
					L5T2.setText(String.valueOf(Val));
					index2++;
					break;
				case 2:
					L5PF3.setText("Fail");
					L5T3.setText(String.valueOf(Val));
					index2++;
					break;
				case 3:
					L5PF4.setText("Fail");
					L5T4.setText(String.valueOf(Val));
					index2++;
					break;
				case 4:
					L5PF5.setText("Fail");
					L5T5.setText(String.valueOf(Val));
					index2++;
					break;
				case 5:
					L5PF6.setText("Fail");
					L5T6.setText(String.valueOf(Val));
					index2++;
					break;
				}
			}
		}
		for (int val2 : L5Marks) {
			if (val2 > 40) {
				l5Credits += 20;
			}
		}
		int total = 0;
		int min = 100;
		for (int val3 : L5Marks) {
			total += val3;

			if (val3 < min) {
				
				min = val3;
			}
		}
		Level06Controller level06=new Level06Controller();
		level06.setMinimunLevel05(min);
		level06.setTotalLevel05(total);
	}

	// To go to the next level
	public void NextToLevel05(ActionEvent event) throws Exception {
		if (l5Credits >= 100) {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Level06.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel5 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel5.setScene(scene);
			nexttoLevel5.show();
			// To get the first re-sit
		} else if (l5Credits >= 40) {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Resit2.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel5 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel5.setScene(scene);
			nexttoLevel5.show();
		} else {
			Parent root = FXMLLoader.load(getClass().getResource("/application/CetDip.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel05 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel05.setScene(scene);
			nexttoLevel05.show();
		}
	}

	// To exit from level5
	public void L5Exit(ActionEvent event) throws Exception {
		if (l5Credits >= 100) {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Diploma.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel4 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel4.setScene(scene);
			nexttoLevel4.show();
		} else {
			Parent root = FXMLLoader.load(getClass().getResource("/application/CetDip.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel5 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel5.setScene(scene);
			nexttoLevel5.show();
		}
	}
}

package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Level04Controller {
	int l4Credits = 0;
	@FXML
	private TextField L4StudentsName, L4StudentsID, L4ICT11, L4ICT12, L4ICT13, L4ICT14, L4ICT15, L4ICT16, L4ICT21,
			L4ICT22, L4ICT23, L4ICT24, L4ICT25, L4ICT26, L4CW1, L4CW2, L4CW3, L4CW4, L4CW5, L4CW6;
	@FXML
	private Label L4T1, L4T2, L4T3, L4T4, L4T5, L4T6, L4PF1, L4PF2, L4PF3, L4PF4, L4PF5, L4PF6, L4Repeat1, L4Repeat2;

	// Event Listener on Button.onAction
	@FXML
	public void L4CalRe(ActionEvent event)throws Exception{
		L4Repeat1.setText("");
		L4Repeat2.setText("");
		if (L4StudentsName.getText().equals("") || L4StudentsID.getText().equals("")) {
			L4Repeat1.setText("Please enter a student's name and a student's ID first");
		} else if (L4ICT11.getText().equals("") || L4ICT12.getText().equals("") || L4ICT13.getText().equals("")
				|| L4ICT14.getText().equals("") || L4ICT15.getText().equals("") || L4ICT16.getText().equals("")
				|| L4ICT21.getText().equals("") || L4ICT22.getText().equals("") || L4ICT23.getText().equals("")
				|| L4ICT24.getText().equals("") || L4ICT25.getText().equals("") || L4ICT26.getText().equals("")
				|| L4CW1.getText().equals("") || L4CW2.getText().equals("") || L4CW3.getText().equals("")
				|| L4CW4.getText().equals("") || L4CW5.getText().equals("") || L4CW6.getText().equals("")) {
			L4Repeat1.setText(
					"Please enter marks for all ICTs and Course Works. If you areabsent for any, please enter 0");
		}
		ArrayList<Integer> L4Marks = new ArrayList<>();

		// Getting ICT and CW marks and calculate the average marks
		L4Marks.add((Integer.parseInt(L4ICT11.getText()) + Integer.parseInt(L4ICT21.getText())
				+ Integer.parseInt(L4CW1.getText())) / 3);
		L4Marks.add((Integer.parseInt(L4ICT12.getText()) + Integer.parseInt(L4ICT22.getText())
				+ Integer.parseInt(L4CW2.getText())) / 3);
		L4Marks.add((Integer.parseInt(L4ICT13.getText()) + Integer.parseInt(L4ICT23.getText())
				+ Integer.parseInt(L4CW3.getText())) / 3);
		L4Marks.add((Integer.parseInt(L4ICT14.getText()) + Integer.parseInt(L4ICT24.getText())
				+ Integer.parseInt(L4CW4.getText())) / 3);
		L4Marks.add((Integer.parseInt(L4ICT15.getText()) + Integer.parseInt(L4ICT25.getText())
				+ Integer.parseInt(L4CW5.getText())) / 3);
		L4Marks.add((Integer.parseInt(L4ICT16.getText()) + Integer.parseInt(L4ICT26.getText())
				+ Integer.parseInt(L4CW6.getText())) / 3);
		// To check whether the modules are passed or failed and to get credits
		// to passed modules
		int index1 = 0;
		for (int Val : L4Marks) {
			// To identify and to show the results for the passed modules
			if (Val >= 40) {
				switch (index1) {
				case 0:
					L4PF1.setText("Pass");
					L4T1.setText(String.valueOf(Val));
					index1++;
					break;
				case 1:
					L4PF2.setText("Pass");
					L4T2.setText(String.valueOf(Val));
					index1++;
					break;
				case 2:
					L4PF3.setText("Pass");
					L4T3.setText(String.valueOf(Val));
					index1++;
					break;
				case 3:
					L4PF4.setText("Pass");
					L4T4.setText(String.valueOf(Val));
					index1++;
					break;
				case 4:
					L4PF5.setText("Pass");
					L4T5.setText(String.valueOf(Val));
					index1++;
					break;
				case 5:
					L4PF6.setText("Pass");
					L4T6.setText(String.valueOf(Val));
					index1++;
					break;
				}
				// To identify and to show results for the failed modules
			} else {
				switch (index1) {
				case 0:
					L4PF1.setText("Fail");
					L4T1.setText(String.valueOf(Val));
					index1++;
					break;
				case 1:
					L4PF2.setText("Fail");
					L4T2.setText(String.valueOf(Val));
					index1++;
					break;
				case 2:
					L4PF3.setText("Fail");
					L4T3.setText(String.valueOf(Val));
					index1++;
					break;
				case 3:
					L4PF4.setText("Fail");
					L4T4.setText(String.valueOf(Val));
					index1++;
					break;
				case 4:
					L4PF5.setText("Fail");
					L4T5.setText(String.valueOf(Val));
					index1++;
					break;
				case 5:
					L4PF6.setText("Fail");
					L4T6.setText(String.valueOf(Val));
					index1++;
					break;
				}
			}
		}
		for (int val2 : L4Marks) {
			if (val2 > 40) {
				l4Credits += 20;
			}
		}
		// To reward condoned credits
		if (l4Credits >= 40 && l4Credits < 100) {
			Collections.reverse(L4Marks);
			int count = 1;
			for (int val : L4Marks) {
				if (val > 29 && val < 40 && count == 2) {
					l4Credits += 20;
					count++;
				}
			}
		}

	}

	/*
	 * To go to the next level and to get the first re-sit attempt for the
	 * failed modules
	 */
	public void NextToLevel04(ActionEvent event) throws Exception {
		System.out.println(l4Credits);
		if (l4Credits >= 100) {
			Parent root= FXMLLoader.load(getClass().getResource("Level05.fxml"));
			  Scene scene = new Scene(root);
			  Stage nexttoLevel4Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			  nexttoLevel4Stage.setScene(scene);
			  //lvl5Stage.setTitle("University of Gugsi,no where particular");
			  nexttoLevel4Stage.show();
		} else if(l4Credits>=40 && l4Credits<100){
			Parent root = FXMLLoader.load(getClass().getResource("/application/Resit1.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel4 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel4.setScene(scene);
			nexttoLevel4.show();
		}else{
			Parent root = FXMLLoader.load(getClass().getResource("/application/Sorry.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel4 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel4.setScene(scene);
			nexttoLevel4.show();
		}
	}

	public void L4Exit(ActionEvent event) throws Exception {
		if (l4Credits >= 100) {
			Parent root = FXMLLoader.load(getClass().getResource("/application/CetDip.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel4 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel4.setScene(scene);
			nexttoLevel4.show();
		} else {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Sorry.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel4 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel4.setScene(scene);
			nexttoLevel4.show();
		}
	}
}

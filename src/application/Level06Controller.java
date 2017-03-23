package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Level06Controller {
	int l6Credits = 0;
	public static int minimunLevel05;
	public static int totalLevel05;
	public static double getAverages;

	public static int getMinimunLevel05() {
		return minimunLevel05;
	}

	public static void setMinimunLevel05(int number) {
		Level06Controller.minimunLevel05 = number;
	}

	public static int getTotalLevel05() {
		return totalLevel05;
	}

	public static void setTotalLevel05(int number) {
		Level06Controller.totalLevel05 = number;
	}

	@FXML
	private TextField L6ICT11, L6ICT21, L6ICT31, L6ICT41, L6ICT51, L6ICT12, L6ICT22, L6ICT32, L6ICT42, L6ICT52, L6CW1,
			L6CW2, L6CW3, L6CW4, L6CW5;
	@FXML
	private Label L6T1, L6T2, L6T3, L6T4, L6T5, L6PF1, L6PF2, L6PF3, L6PF4, L6PF5, L6Repeat1, L6Repeat2;

	// Event Listener on Button.onAction
	@FXML
	public void L6CalRe(ActionEvent event) {
		ArrayList<Integer> L6Marks = new ArrayList<>();
		// Getting ICT and CW marks and calculate the average marks
		L6Marks.add((Integer.parseInt(L6ICT11.getText()) + Integer.parseInt(L6ICT12.getText())
				+ Integer.parseInt(L6CW1.getText())) / 3);
		L6Marks.add((Integer.parseInt(L6ICT21.getText()) + Integer.parseInt(L6ICT22.getText())
				+ Integer.parseInt(L6CW2.getText())) / 3);
		L6Marks.add((Integer.parseInt(L6ICT31.getText()) + Integer.parseInt(L6ICT32.getText())
				+ Integer.parseInt(L6CW3.getText())) / 3);
		L6Marks.add((Integer.parseInt(L6ICT41.getText()) + Integer.parseInt(L6ICT42.getText())
				+ Integer.parseInt(L6CW4.getText())) / 3);
		L6Marks.add((Integer.parseInt(L6ICT51.getText()) + Integer.parseInt(L6ICT52.getText())
				+ Integer.parseInt(L6CW5.getText())) / 3);
		// To check whether the modules are passed of failed and to get credits
		// to passed ones
		int index3 = 0;
		for (int Val : L6Marks) {
			if (Val >= 40) {
				switch (index3) {
				case 0:
					L6PF1.setText("Pass");
					L6T1.setText(String.valueOf(Val));
					l6Credits += 20;
					index3++;
					break;
				case 1:
					L6PF2.setText("Pass");
					L6T2.setText(String.valueOf(Val));
					l6Credits += 20;
					index3++;
					break;
				case 2:
					L6PF3.setText("Pass");
					L6T3.setText(String.valueOf(Val));
					l6Credits += 20;
					index3++;
					break;
				case 3:
					L6PF4.setText("Pass");
					L6T4.setText(String.valueOf(Val));
					l6Credits += 20;
					index3++;
					break;
				case 4:
					L6PF5.setText("Pass");
					L6T5.setText(String.valueOf(Val));
					l6Credits += 20;
					index3++;
				}
			} else {
				switch (index3) {
				case 0:
					L6PF1.setText("Fail");
					index3++;
					break;
				case 1:
					L6PF2.setText("Fail");
					index3++;
					break;
				case 2:
					L6PF3.setText("Fail");
					index3++;
					break;
				case 3:
					L6PF4.setText("Fail");
					index3++;
					break;
				case 4:
					L6PF5.setText("Fail");
					index3++;
					break;
				}
			}
		}
		for (int val2 : L6Marks) {
			if (val2 > 40) {
				l6Credits += 20;
			}
		}
		int totalL06=0;
		Level06Controller level06 = new Level06Controller();
		level06.getMinimunLevel05();
		int min2 = 100;
		for (int val3 : L6Marks) {
			totalL06+=val3;

			if (val3 < min2) {
				min2 = val3;
				
			}
		}
		int AllRanks;
		double AvgRanks;
		level06.getTotalLevel05();
		if(min2>minimunLevel05){
		     AllRanks=totalLevel05-minimunLevel05;
		    AvgRanks=(((AllRanks/500.0)*(1/3.0))+((totalL06/500.0)*(2/3.0)))*100;
		    
		    }else{
		    	 AllRanks=totalL06-min2;
		    	  AvgRanks=(((totalLevel05/600.0)*(1/3.0))+((AllRanks/400.0)*(2/3.0)))*100;
		    }
		AwardsController award=new AwardsController();
		award.setGetAverages(AvgRanks);
	}

	// To go to the award calculation
	public void L6OK(ActionEvent event) throws Exception {
		if (l6Credits >= 100) {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Awards.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel5 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel5.setScene(scene);
			nexttoLevel5.show();
			// To get the first re sit
		} else {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Resit3.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLevel05 = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLevel05.setScene(scene);
			nexttoLevel05.show();
		}
	}
}

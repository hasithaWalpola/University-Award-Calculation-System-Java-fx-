package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private TextField Username;
	@FXML
	private PasswordField Password;
	@FXML
	private Label Failure;
	
	public void Login(ActionEvent event)throws Exception{
		if (Username.getText().equals("admin") && Password.getText().equals("123")){
			Parent root = FXMLLoader.load(getClass().getResource("/application/Level04.fxml"));
			Scene scene = new Scene(root);
			Stage nexttoLogIn = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			nexttoLogIn.setScene(scene);
			nexttoLogIn.show();
		}else{
			Failure.setText("          Login Failed, Try Again");
			Username.clear();
			Password.clear();
		}
	}
}


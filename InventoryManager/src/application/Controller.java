package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	public TextField tfUsername;
	@FXML
	public PasswordField pfPassword;
	@FXML
	public Button btnSignUp;
	@FXML
	public Label lblOtherAlert;
	
	SignUp su = new SignUp(); 
	
	public void signUpPressed() {
		System.out.println("signUpPressed was called");
		su.signUpValidation();
	}

}

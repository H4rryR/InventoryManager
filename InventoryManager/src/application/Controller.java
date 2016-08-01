package application;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;

public class Controller {

	@FXML
	private TextField tfUsername;
	@FXML
	private PasswordField pfPassword;
	@FXML
	private Button btnSignUp;
	@FXML
	private Label lblOtherAlert;

	private SignUp su = new SignUp();

	public void signUpPressed() {
		
		su.signUp(tfUsername, pfPassword, lblOtherAlert);
		
	}
}
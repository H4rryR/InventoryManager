package application;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.util.ArrayList;

import javafx.fxml.FXML;

public class Controller {

	@FXML private TextField tfUsername;
	@FXML private PasswordField pfPassword;
	@FXML private Button btnSignUp;
	@FXML private Button btnSignIn;
	@FXML private Label lblOtherAlert;
	
	private ArrayList<String> usernames = new ArrayList<String>();
	private ArrayList<String> passwords = new ArrayList<String>();

	private SignUp su = new SignUp();
	private SignIn si = new SignIn();

	public void signUpPressed() {
		su.signUp(tfUsername, pfPassword, lblOtherAlert, usernames, passwords);
	}
	
	public void signInPressed() {
		si.signIn(tfUsername, pfPassword, lblOtherAlert, usernames, passwords);
	}
}
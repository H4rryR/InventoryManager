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
	@FXML private Button btnSignOut;
	@FXML private Label lblOtherAlert;
	
	private ArrayList<String> usernames = new ArrayList<String>();
	private ArrayList<String> passwords = new ArrayList<String>();
	private boolean userSecure;

	private SignUp su = new SignUp();
	private SignIn si = new SignIn();
	private SignOut so = new SignOut();

	public void signUpPressed() {
		su.signUp(tfUsername, pfPassword, lblOtherAlert, usernames, passwords);
	}
	
	public boolean signInPressed() {
		return si.signIn(tfUsername, pfPassword, lblOtherAlert, usernames, passwords);
	}
	
	public void signOutPressed() {
		so.signOut(lblOtherAlert, userSecure);
	}
}
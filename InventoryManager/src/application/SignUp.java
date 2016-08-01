package application;

import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUp {
	
	private String username;
	private String password;
	
	public void signUp(TextField tfUsername, PasswordField pfPassword, Label lblOtherAlert, ArrayList<String> usernames, ArrayList<String> passwords) {
	
		System.out.println("Sign Up was pressed");
	
		username = tfUsername.getText();
		password = pfPassword.getText();
		
		if (username.length() >= 5 && password.length() >= 8) {
			usernames.add(username);
			passwords.add(password);
			lblOtherAlert.setText("Account created successfully");
		} else if (username.length() >= 5) {
			lblOtherAlert.setText("Password must be 8 characters or longer");
		} else if (password.length() >= 8) {
			lblOtherAlert.setText("Username must be 5 characters or longer");
		} else if (username.length() < 5 && password.length() < 8) {
			lblOtherAlert.setText("Username must be 5 characters or longer and password must be 8 characters or longer");
		} else {
			lblOtherAlert.setText("Username must be 5 characters or longer and password must be 8 characters or longer");
		}
		
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		
		return;
	}
	
}
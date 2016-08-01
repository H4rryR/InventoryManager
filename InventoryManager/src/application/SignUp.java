package application;

import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUp {
	
	public String username;
	public String password;
	
	public ArrayList<String> usernames = new ArrayList<String>();
	public ArrayList<String> passwords = new ArrayList<String>();
	
	public Label signUp(TextField tfUsername, PasswordField pfPassword, Label lblOtherAlert) {
	
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
		
		System.out.println("Username: " + usernames);
		System.out.println("Password: " + passwords);
		
		return lblOtherAlert;
	}
	
}
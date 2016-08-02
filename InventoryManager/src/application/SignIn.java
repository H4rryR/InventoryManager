package application;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignIn {
	
	private String username;
	private String password;
	private int userIndex;
	private boolean usernameAuth;
	private boolean passwordAuth;
	private boolean userSecure;

	public boolean signIn(TextField tfUsername, PasswordField pfPassword, Label lblOtherAlert, ArrayList<String> usernames, ArrayList<String> passwords) {
		
		System.out.println("Sign In was pressed");
		
		username = tfUsername.getText();
		password = pfPassword.getText();
		
		System.out.println(usernames);
		System.out.println(passwords);
		
		System.out.println(username);
		System.out.println(password);
		
		for (String user : usernames) {
			if (user.equals(username)) {
				usernameAuth = true;	
			} else {
				usernameAuth = false;
			}
			
			if (usernameAuth == true) {
				userIndex = usernames.indexOf(user);
				break;
			}
		}
		
		if (passwords.get(userIndex).equals(password)) {
			passwordAuth = true;	
		} else {
			passwordAuth = false;
		}
		
		if (usernameAuth == true && passwordAuth == true) {
			System.out.println("Username and Password was correct");
			userSecure = true;
		} else {
			System.out.println("Username or Password was incorrect");
			userSecure = false;
		}
		
		if (userSecure) {
			lblOtherAlert.setText("Signed in successfully");
		} else {
			lblOtherAlert.setText("Username or password was incorrect");
		}
		
		return userSecure;
	}	
}
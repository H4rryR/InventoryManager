package application;

import java.util.ArrayList;

public class SignUp {
	
	public String username;
	public String password;
	public ArrayList<String> usernames = new ArrayList<String>();
	public ArrayList<String> passwords = new ArrayList<String>();
	
	Controller c = new Controller();
	
	public void signUpValidation() {
	
	System.out.println("signUpValidation was called");
	username = c.tfUsername.getText();
	password = c.pfPassword.getText();
	
	if (username.length() >= 5 && password.length() >= 8) {
		usernames.add(username);
		passwords.add(password);
		c.lblOtherAlert.setText("Account created successfully");
		
	} else if (username.length() >= 5) {
		c.lblOtherAlert.setText("PASSWORD MUST BE 8 CHARACTERS OR LONGER");
		
	} else if (password.length() >= 8) {
		c.lblOtherAlert.setText("USERNAME MUST BE 5 CHARACTERS OR LONGER");
		
	} else if (username.length() < 5 && password.length() < 8) {
		c.lblOtherAlert.setText("USERNAME MUST BE 5 CHARACTERS OR LONGER AND PASSWORD MUST BE 8 CHARACTERS OR LONGER");
		
	} else {
		c.lblOtherAlert.setText("USERNAME MUST BE 5 CHARACTERS OR LONGER AND PASSWORD MUST BE 8 CHARACTERS OR LONGER");
	}
	
	System.out.println("Username: " + usernames);
	System.out.println("Password: " + passwords);
	
	}
	
}

package application;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class Controller {

	@FXML
	private TextField tfUsername;
	@FXML
	private TextField pfPassword;
	@FXML
	private Button btnSignUp;
	@FXML
	private Label lblOtherAlert;

	Main main = new Main();

	public void signUpPressed() {
		System.out.println("Sign Up was pressed");
		main.username = tfUsername.getText();
		main.password = pfPassword.getText();
		
		if (main.username.length() >= 5 && main.password.length() >= 8) {
			main.usernames.add(main.username);
			main.passwords.add(main.password);
			lblOtherAlert.setText("Account created successfully");
			
		} else if (main.username.length() >= 5) {
			lblOtherAlert.setText("PASSWORD MUST BE 8 CHARACTERS OR LONGER");
			
		} else if (main.password.length() >= 8) {
			lblOtherAlert.setText("USERNAME MUST BE 5 CHARACTERS OR LONGER");
			
		} else if (main.username.length() < 5 && main.password.length() < 8) {
			lblOtherAlert.setText("USERNAME MUST BE 5 CHARACTERS OR LONGER AND PASSWORD MUST BE 8 CHARACTERS OR LONGER");
			
		} else {
			lblOtherAlert.setText("USERNAME MUST BE 5 CHARACTERS OR LONGER AND PASSWORD MUST BE 8 CHARACTERS OR LONGER");
		}
		
		System.out.println("Username: " + main.usernames);
		System.out.println("Password: " + main.passwords);
	}

//	public void usernameEnterPressed() {
//		
//	}
//	
//	public void passwordEnterPressed() {
//		
//	}
	
	public void signInPressed() {
		System.out.println("Sign In was pressed");
	}

	public void signOutPressed() {
		System.out.println("Sign Out was pressed");
	}

	public void accountSettingsPressed() {
		System.out.println("Account Settings was pressed");
	}

	public void searchPressed() {
		System.out.println("Search was pressed");
	}

	public void clearPressed() {
		System.out.println("Clear was pressed");
	}

	public void submitPressed() {
		System.out.println("Submit was pressed");
	}

}

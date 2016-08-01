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

}
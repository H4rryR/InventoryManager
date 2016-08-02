package application;

import javafx.scene.control.Label;

public class SignOut {

	public void signOut(Label lblOtherAlert, boolean userSecure) {

		System.out.println("Sign Out was pressed");
		
		userSecure = false;
		
		lblOtherAlert.setText("Signed out successfully");
		System.out.println("User signed out");
		
		return;
	}	
}
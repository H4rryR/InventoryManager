package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Other {
	
	public void clearFields(TextField tfNewProductName, TextField tfNewProductPrice, TextField tfNewProductID, TextField tfNewProductQuantity, 
							TextField tfSearch, Label lblStoredProductName, Label lblStoredProductPrice, Label lblStoredProductID, 
							Label lblStoredProductQuantity) {
		
		tfNewProductName.setText("");
		tfNewProductPrice.setText("");
		tfNewProductID.setText("");
		tfNewProductQuantity.setText("");
		tfSearch.setText("");
		lblStoredProductName.setText("");
		lblStoredProductPrice.setText("");
		lblStoredProductID.setText("");
		lblStoredProductQuantity.setText("");
		
		return;
	}
	
}
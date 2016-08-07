package application;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Other {
	
	public void clearFields(TextField tfNewProductName, TextField tfNewProductPrice, TextField tfNewProductID, TextField tfNewProductQuantity,
							Label lblStoredProductName, Label lblStoredProductPrice, Label lblStoredProductID, 
							Label lblStoredProductQuantity) {
		
		tfNewProductName.setText("");
		tfNewProductPrice.setText("");
		tfNewProductID.setText("");
		tfNewProductQuantity.setText("");
		lblStoredProductName.setText("");
		lblStoredProductPrice.setText("");
		lblStoredProductID.setText("");
		lblStoredProductQuantity.setText("");
		
		return;
	}
	
	public static double round(double price, int places) {
		
		if (places < 0) throw new IllegalArgumentException();
		
		BigDecimal bd = new BigDecimal(price);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		
		return bd.doubleValue(); 
	}
}
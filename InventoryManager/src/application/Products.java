package application;

import javafx.scene.control.TextField;

public class Products {

//	private String productName;
	private String newProductName;
	private double newProductPrice;
	private String newProductID;
	private int newProductQuantity;
		
//	public String getProductName(TextField tfSearch) {
//		
//		productName = tfSearch.getText();
//		
//		return productName;
//	}
//	
//	public void selectProductName(String productName, Label lblOtherAlert, ListView<String> lvProductNames) { //TODO - working on now
//		
//		try {
//			
//		} catch (Exception e) {
//			
//			System.out.println(productName + " is not in the inventory array list");
//			lblOtherAlert.setText("The product " + productName + " is not in your inventory");
//		}
//		
//		return;
//	}
	
	public String getNewProductName(TextField tfNewProductName) {
		
		newProductName = tfNewProductName.getText();
		
		return newProductName;
	}
	
	public double getNewProductPrice(TextField tfNewProductPrice) {
		
		newProductPrice = Other.round(Double.parseDouble(tfNewProductPrice.getText()), 2);
		
		return newProductPrice;
	}
	
	public String getNewProductID(TextField tfNewProductID) {
		
		newProductID = tfNewProductID.getText();
		
		return newProductID;
	}
	
	public int getNewProductQuantity(TextField tfNewProductQuantity) {
		
		newProductQuantity = Integer.parseInt(tfNewProductQuantity.getText());
		
		return newProductQuantity;
	}
	
}
package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Products {

	private String productName;
	private String selectedProductName;
	private String newProductName;
	private double newProductPrice;
	private long newProductID;
	private int newProductQuantity;
	private String items[] = {"bread", "milk", "flour"};
	private ObservableList<String> productNamesList = FXCollections.observableArrayList(items);	
	
	public String getProductName(TextField tfSearch) {
		productName = tfSearch.getText();
		return productName;
	}
	
	public void selectProductName(String productName) {
		return;
	}
	
	public void getSelectedProductsNameAndDisplayData() {
		return;
	}
	
	public String getNewProductName(TextField tfNewProductName) {
		newProductName = tfNewProductName.getText();
		return newProductName;
	}
	
	public double getNewProductPrice(TextField tfNewProductPrice) {
		// TODO - get the new product price.
		return newProductPrice;
	}
	
	public long getNewProductID(TextField tfNewProductID) {
		// TODO - get the new product ID.
		return newProductID;
	}
	
	public int getNewProductQuantity(TextField tfNewProductQuantity) {
		// TODO - get the new product quantity.
		return newProductQuantity;
	}
	
	public void displayInventoryItems(ListView<String> lvProductNames) {
		lvProductNames.setItems(productNamesList);
		return;
	}
	
	public void displayStoredProductData(String selectedProductName) {
		/*
		 *  TODO - 
		 */
	}

}
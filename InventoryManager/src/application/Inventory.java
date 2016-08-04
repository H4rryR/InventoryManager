package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Inventory {

	private double totalInventoryValue;
	private int numberOfProducts = 0;
	private String productNames[];
	private double productPrices[];
	private String productIDs[];
	private int productQuantities[];

	public String[] updateProductListAndDataArrays(String newProductName, double newProductPrice, String newProductID, int newProductQuantity) {
		
		++numberOfProducts;
		
		productNames = new String[numberOfProducts];
		productPrices = new double[numberOfProducts];
		productIDs = new String[numberOfProducts];
		productQuantities = new int[numberOfProducts];
		// TODO - This will be changed into a loop checking for an empty slot or I can just add to the end of the arrays 
		productNames[0] = newProductName;
		productPrices[0] = newProductPrice;
		productIDs[0] = newProductID;
		productQuantities[0] = newProductQuantity;
		
		return productNames;
	}
	
	public void displayInventoryItemNames(ListView<String> lvProductNames, ObservableList<String> productNamesList) {
		productNamesList = FXCollections.observableArrayList(productNames);	
		lvProductNames.setItems(productNamesList);
		return;
	}
	
	public void getSelectedProductsNameAndDisplayData(ListView<String> lvProductNames, ObservableList<String> productNamesList) {
		return;
	}
	
	public double calcTotalInventoryValue() {
		
		/*
		 *  TODO - get all of the product prices.
		 *  TODO - get all of the product quantities.
		 *  TODO - calculate the total value of the inventory.
		 */
		
		return totalInventoryValue;
	}
	
}
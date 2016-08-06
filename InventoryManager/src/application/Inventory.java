package application;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class Inventory {

	private double totalInventoryValue;
	private ArrayList<String> productNames = new ArrayList<String>();
	private ArrayList<Double> productPrices = new ArrayList<Double>();
	private ArrayList<String> productIDs = new ArrayList<String>();
	private ArrayList<Integer> productQuantities = new ArrayList<Integer>();

	public void updateProductLists(String newProductName, double newProductPrice, String newProductID, int newProductQuantity) {
		
		productNames.add(newProductName);
		productPrices.add(newProductPrice);
		productIDs.add(newProductID);
		productQuantities.add(newProductQuantity);
		
		return;
	}
	
	public void getAndDisplayStoredItemDetails(String newSelectedProduct, Label lblStoredProductName, Label lblStoredProductPrice, 
											   Label lblStoredProductID, Label lblStoredProductQuantity) {
		
		int index;
		
		index = productNames.indexOf(newSelectedProduct);
		
		lblStoredProductName.setText(newSelectedProduct);
		lblStoredProductPrice.setText(String.valueOf(productPrices.get(index)));
		lblStoredProductID.setText(String.valueOf(productIDs.get(index)));
		lblStoredProductQuantity.setText(String.valueOf(productQuantities.get(index)));
		
		return;
	}
	
	public void displayInventoryItemNames(ListView<String> lvProductNames, ObservableList<String> productNamesList) {
		
		productNamesList = FXCollections.observableArrayList(productNames);	
		lvProductNames.setItems(productNamesList);
		
		return;
	}
	
	public void calcTotalInventoryValue(Label lblTotalInventoryValue) {
		
		totalInventoryValue = 0;
		
		for (double price : productPrices) {
			
			totalInventoryValue += (price * productQuantities.get(productPrices.indexOf(price)));
		}
		
		lblTotalInventoryValue.setText(String.valueOf(totalInventoryValue));
		
		return;
	}
}
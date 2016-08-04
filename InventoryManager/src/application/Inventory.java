package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
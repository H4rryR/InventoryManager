package application;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

public class Controller {

	@FXML private TextField tfUsername;
	@FXML private TextField tfSearch;
	@FXML private TextField tfNewProductName;
	@FXML private TextField tfNewProductPrice;
	@FXML private TextField tfNewProductID;
	@FXML private TextField tfNewProductQuantity;
	
	@FXML private PasswordField pfPassword;
	
	@FXML private Button btnSignUp;
	@FXML private Button btnSignIn;
	@FXML private Button btnSignOut;
	@FXML private Button btnSearch;
	@FXML private Button btnClear;
	@FXML private Button btnSubmit;
	@FXML private Button btnCalculate;
	@FXML private Button btnUpdate;
	
	@FXML private Label lblNoStock;
	@FXML private Label lblLowStockt;
	@FXML private Label lblOtherAlert;
	@FXML private Label lblTotalInventoryValue;
	@FXML private Label lblStoredProductName;
	@FXML private Label lblStoredProductPrice;
	@FXML private Label lblStoredProductID;
	@FXML private Label lblStoredProductQuantity;
	
	@FXML private ListView<String> lvProductNames = new ListView<String>();
	
	private ArrayList<String> usernames = new ArrayList<String>();
	private ArrayList<String> passwords = new ArrayList<String>();
	private ObservableList<String> productNamesList;	
	private boolean userSecure;
	private String productName;
	private String newProductName;
	private double newProductPrice;
	private String newProductID;
	private int newProductQuantity;

	private SignUp su = new SignUp();
	private SignIn si = new SignIn();
	private SignOut so = new SignOut();
	private Products p = new Products();
	private Inventory i = new Inventory();
	private Other o = new Other();
	
	@FXML public void initialize() {
		
		lvProductNames.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newSelectedProduct) {
				
				i.getAndDisplayStoredItemDetails(newSelectedProduct, lblStoredProductName, lblStoredProductPrice, lblStoredProductID, 
												 lblStoredProductQuantity);
			}
		});
	}
	
	@FXML public void signUpPressed() {
		
		su.signUp(tfUsername, pfPassword, lblOtherAlert, usernames, passwords);
	}
	
	@FXML public boolean signInPressed() {
		
		return si.signIn(tfUsername, pfPassword, lblOtherAlert, usernames, passwords);
	}
	
	@FXML public void signOutPressed() {
		
		so.signOut(lblOtherAlert, userSecure);
	}
	
	@FXML public void updatePressed() {
		
		i.displayInventoryItemNames(lvProductNames, productNamesList);
	}
	
	@FXML public void calculatePressed() {
		
		i.calcTotalInventoryValue(lblTotalInventoryValue); 
	}
	
	@FXML public void productNameEntered() {
		
		p.getProductName(tfSearch);
		p.selectProductName(productName);
	}
	
	@FXML public void searchPressed() {
		
		p.getProductName(tfSearch);
	}
	
	@FXML public String newProductNameEntered() {
		
		newProductName = p.getNewProductName(tfNewProductName);
		
		return newProductName;
	}
	
	@FXML public double newProductPriceEntered() {
		
		newProductPrice = p.getNewProductPrice(tfNewProductPrice);
		
		return newProductPrice;
	}
	
	@FXML public String newProductIDEntered() {
		
		newProductID = p.getNewProductID(tfNewProductID);
		
		return newProductID;
	}
	
	@FXML public int newProductQuantityEntered() {
		
		newProductQuantity = p.getNewProductQuantity(tfNewProductQuantity);
		
		return newProductQuantity;
	}
	
	@FXML public void submitPressed() {
		
		i.updateProductLists(newProductName, newProductPrice, newProductID, newProductQuantity);
	}
	
	@FXML public void clearPressed() {
		
		o.clearFields(tfNewProductName, tfNewProductPrice, tfNewProductID, tfNewProductQuantity, tfSearch, lblStoredProductName, 
				lblStoredProductPrice, lblStoredProductID, lblStoredProductQuantity);
	}
}
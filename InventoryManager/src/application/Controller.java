package application;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import java.util.ArrayList;
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
	
	@FXML private ListView<String> lvProductNames = new ListView<>();
	
	private ArrayList<String> usernames = new ArrayList<String>();
	private ArrayList<String> passwords = new ArrayList<String>();
	private boolean userSecure;
	private String productName;
	private String selectedProductName;
	private String newProductName;
	private double newProductPrice;
	private long newProductID;
	private int newProductQuantity;

	private SignUp su = new SignUp();
	private SignIn si = new SignIn();
	private SignOut so = new SignOut();
	private Products p = new Products();
	private Inventory i = new Inventory();
	private Other o = new Other();
	
	public void signUpPressed() {
		su.signUp(tfUsername, pfPassword, lblOtherAlert, usernames, passwords);
	}
	
	public boolean signInPressed() {
		return si.signIn(tfUsername, pfPassword, lblOtherAlert, usernames, passwords);
	}
	
	public void signOutPressed() {
		so.signOut(lblOtherAlert, userSecure);
	}
	
	public void updatePressed() {
		p.displayInventoryItems(lvProductNames);
	}
	
	public void calculatePressed() {
		i.calcTotalInventoryValue(); 
	}
	
	public void productNameEntered() {		//Called every time a letter is entered into the Search TextField.
		p.getProductName(tfSearch);
		p.selectProductName(productName);
	}
	
	public void searchPressed() {
		p.getProductName(tfSearch);
	}
	
	public void productSelected() {
		p.getSelectedProductsNameAndDisplayData();
		return;
	}
	
	public String newProductNameEntered() {
		return p.getNewProductName(tfNewProductName);
	}
	
	public double newProductPriceEntered() {
		return p.getNewProductPrice(tfNewProductPrice);
	}
	
	public long newProductIDEntered() {
		return p.getNewProductID(tfNewProductID);
	}
	
	public int newProductQuantityEntered() {
		return p.getNewProductQuantity(tfNewProductQuantity);
	}
	
	public void submitPressed() {
		/* 
		 * TODO get new product data from new product details area.
		 * TODO update the product data list with these details.
		 */
	}
	
	public void clearPressed() {
		o.clearFields(tfNewProductName, tfNewProductPrice, tfNewProductID, tfNewProductQuantity, tfSearch, lblStoredProductName, 
				lblStoredProductPrice, lblStoredProductID, lblStoredProductQuantity);
	}
	
}
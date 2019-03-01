

import java.util.ArrayList;
/**
 * 
 * @author giray
 *
 */

public class Customer extends Person{
	
	
	
	private int costumerID;
	private static int costumerID2;
	private String password;
	private double balance;
	private ArrayList<Item> shoppingCart = new ArrayList<Item>();
	
	
	public int getCostumerID() {
		return costumerID;
	}

	/**
	 * @param costumerID
	 */
	public void setCostumerID(int costumerID) {
		this.costumerID = costumerID;
	}

	/**
	 * @return Static costumer id value
	 */
	public static int getCostumerID2() {
		return costumerID2;
	}

	/**
	 * @param costumerID2
	 */
	public static void setCostumerID2(int costumerID2) {
		Customer.costumerID2 = costumerID2;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return shopping card
	 */
	public ArrayList<Item> getShoppingCart() {
		return shoppingCart;
	}

	/**
	 * @param shoppingCart
	 */
	public void setShoppingCart(ArrayList<Item> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	/**
	 * @param name   customer name
	 * @param email		customer email
	 * @param dateOfBirth		customer dateOfBirth
	 * @param balance		customer balance
	 * @param password		customer password
	 */
	public Customer(String name,String email,String dateOfBirth,double balance,String password){
		
		super(name,email,dateOfBirth);
		
		this.password=password;
		this.balance=balance;
		costumerID2++;
		this.costumerID=costumerID2;
		
	}
	
	public void changePassword(String oldPass,String newPass){
		if(this.password.equals(oldPass)){
			this.password=newPass;
			System.out.println("The password has been successfully changed.");
		}
		else System.out.println("The given password does not match the current password. Please try again.");
	
	}
	
	
	/**
	 * @param call campaign array
	 */
	public void showCampaign(ArrayList<Campaign> camp){
		
		if(camp.size()==0){
			System.out.println("No campaign has been created so far!");
		}
		else{
		for(Campaign abc:camp){
			System.out.println(abc.toString());
		}
		}
		
	}
	
	
	public String toString(){
		String cons="Customer Name: "+getName()+" ID: "+costumerID+" e-mail: "+getEmail()+" Date Of Birth: "+getDateOfBirth()+" STATUS: CLASSIC";
		return cons;
	}
	

	
}
